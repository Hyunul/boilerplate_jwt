package hyunul.boilerplate_jwt.api.login.application.impl;

import hyunul.boilerplate_jwt.api.login.application.LoginService;
import hyunul.boilerplate_jwt.api.login.dto.request.LoginRequestDTO;
import hyunul.boilerplate_jwt.api.login.dto.response.LoginResponseDTO;
import hyunul.boilerplate_jwt.api.login.exception.LoginException;
import hyunul.boilerplate_jwt.api.login.exception.LoginExceptionResult;
import hyunul.boilerplate_jwt.api.token.vo.RefreshToken;
import hyunul.boilerplate_jwt.api.user.application.UserGetService;
import hyunul.boilerplate_jwt.api.user.dto.response.UserGetResponseDTO;
import hyunul.boilerplate_jwt.config.security.provider.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final UserGetService userGetService;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    private final JwtProvider jwtProvider;

    @Override
    @Transactional
    public LoginResponseDTO login(final LoginRequestDTO loginRequestDTO) {
        // 사용자 정보 조회
        UserGetResponseDTO userInfo = userGetService.getUserByUserId(loginRequestDTO.getUserId());

        // password 일치 여부 체크
        if (!bCryptPasswordEncoder.matches(loginRequestDTO.getPassword(), userInfo.password()))
            throw new LoginException(LoginExceptionResult.NOT_CORRECT);

        // jwt 토큰 생성
        String accessToken = jwtProvider.generateAccessToken(userInfo.id());

        // 기존에 가지고 있는 사용자의 refresh token 제거
        RefreshToken.removeUserRefreshToken(userInfo.id());

        // refresh token 생성 후 저장
        String refreshToken = jwtProvider.generateRefreshToken(userInfo.id());
        RefreshToken.putRefreshToken(refreshToken, userInfo.id());

        return LoginResponseDTO.builder()
                .accessToken(accessToken)
                .refreshToken(refreshToken)
                .build();
    }

}
