package hyunul.boilerplate_jwt.config.web;

import hyunul.boilerplate_jwt.api.user.enums.converter.RoleNameConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Web Config
 * <p>
 * 1. Enum Converter Config
 * </p>
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new RoleNameConverter());
    }

}
