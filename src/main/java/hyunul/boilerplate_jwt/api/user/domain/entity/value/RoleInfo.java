package hyunul.boilerplate_jwt.api.user.domain.entity.value;

import hyunul.boilerplate_jwt.api.user.enums.RoleName;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Getter
@Setter
@Embeddable
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RoleInfo {

    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private RoleName roleName;

    public static RoleInfo create(RoleName roleName) {
        return RoleInfo.builder()
                .roleName(roleName != null ? roleName : RoleName.ROLE_USER)
                .build();
    }
}
