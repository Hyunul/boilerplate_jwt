package hyunul.boilerplate_jwt.api.login.dto.response;

import lombok.Builder;

@Builder
public record LoginResponseDTO(String accessToken, String refreshToken) {
}
