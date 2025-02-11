package hyunul.boilerplate_jwt.api.token.application;

import hyunul.boilerplate_jwt.api.token.dto.response.RefreshTokenResponseDTO;

public interface RefreshTokenService {

    /**
     * refresh token을 이용하여 access token, refresh token 재발급
     *
     * @param refreshToken refresh token
     * @return RefreshTokenResponseDTO
     */
    RefreshTokenResponseDTO refreshToken(final String refreshToken);

}
