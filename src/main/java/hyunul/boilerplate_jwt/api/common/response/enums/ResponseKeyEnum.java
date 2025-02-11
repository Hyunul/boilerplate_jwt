package hyunul.boilerplate_jwt.api.common.response.enums;

import lombok.Getter;

/**
 * Response Data Key Enum
 */
@Getter
public enum ResponseKeyEnum {
    LIST("list"),
    ONE("one"),
    TOTAL("total");

    private final String key;

    ResponseKeyEnum(String key) {
        this.key = key;
    }
}
