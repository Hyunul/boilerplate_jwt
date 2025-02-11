package hyunul.boilerplate_jwt.api.user.dto.response;

import hyunul.boilerplate_jwt.api.user.domain.entity.User;
import hyunul.boilerplate_jwt.api.user.enums.RoleName;
import lombok.Builder;

@Builder
public record UserGetResponseDTO(long id, String userId, String password, String name, String tel, RoleName roleName) {

    public static UserGetResponseDTO of(User user) {
        return UserGetResponseDTO.builder()
                .id(user.getId())
                .userId(user.getLoginInfo().getUserId())
                .password(user.getLoginInfo().getPassword())
                .name(user.getUserInfo().getName())
                .tel(user.getUserInfo().getTel())
                .roleName(user.getRoleInfo().getRoleName())
                .build();
    }

}
