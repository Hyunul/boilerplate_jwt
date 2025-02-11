package hyunul.boilerplate_jwt.api.user.application;

import hyunul.boilerplate_jwt.api.user.dto.request.UserAddRequestDTO;

public interface UserAddService {

    /**
     * 사용자 추가
     *
     * @param userAddRequestDTO UserAddRequestDTO
     */
    void addUser(final UserAddRequestDTO userAddRequestDTO);

}
