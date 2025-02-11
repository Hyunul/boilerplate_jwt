package hyunul.boilerplate_jwt.api.user.enums.converter;

import hyunul.boilerplate_jwt.api.user.enums.RoleName;
import org.springframework.core.convert.converter.Converter;

/**
 * String to Enum Converter
 */
public class RoleNameConverter implements Converter<String, RoleName> {

    @Override
    public RoleName convert(String roleName) {
        return RoleName.fromRole(roleName);
    }

}
