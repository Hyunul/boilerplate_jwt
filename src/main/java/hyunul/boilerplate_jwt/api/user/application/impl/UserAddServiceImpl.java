package hyunul.boilerplate_jwt.api.user.application.impl;

import java.time.LocalDateTime;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hyunul.boilerplate_jwt.api.user.application.UserAddService;
import hyunul.boilerplate_jwt.api.user.domain.entity.User;
import hyunul.boilerplate_jwt.api.user.domain.repository.UserRepository;
import hyunul.boilerplate_jwt.api.user.dto.request.UserAddRequestDTO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserAddServiceImpl implements UserAddService {

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    /**
     * 사용자 추가
     *
     * @param userAddRequestDTO UserAddRequestDTO
     */
    @Override
    @Transactional
    public void addUser(final UserAddRequestDTO userAddRequestDTO) {
        // User DTO to Entity
        User user = User.of(userAddRequestDTO);

        // password 암호화
        user.getLoginInfo().encryptPassword(bCryptPasswordEncoder);
        user.setRegDt(LocalDateTime.now());

        // save
        userRepository.save(user);
    }
}
