package hyunul.boilerplate_jwt.api.token.dto.response;

import lombok.Builder;

@Builder
public record RefreshTokenResponseDTO(String accessToken, String refreshToken) {
}
