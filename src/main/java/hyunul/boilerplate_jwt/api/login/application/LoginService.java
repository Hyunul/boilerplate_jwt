package hyunul.boilerplate_jwt.api.login.application;

import hyunul.boilerplate_jwt.api.login.dto.request.LoginRequestDTO;
import hyunul.boilerplate_jwt.api.login.dto.response.LoginResponseDTO;

public interface LoginService {

    LoginResponseDTO login(final LoginRequestDTO loginRequestDTO);

}
