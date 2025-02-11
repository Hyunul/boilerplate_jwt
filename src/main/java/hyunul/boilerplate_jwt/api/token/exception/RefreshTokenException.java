package hyunul.boilerplate_jwt.api.token.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Refresh Token Exception
 */
@Getter
@RequiredArgsConstructor
public class RefreshTokenException extends RuntimeException {

    private final RefreshTokenExceptionResult refreshTokenExceptionResult;

}
