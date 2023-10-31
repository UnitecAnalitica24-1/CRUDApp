package mx.unitec;

import mx.unitec.Viewresolvers.JakartaViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
public class WebConfig {

    @Bean
    public ViewResolver viewResolver() {
        JakartaViewResolver viewResolver = new JakartaViewResolver();
        viewResolver.setSuffix(".html");
        viewResolver.setPrefix("/WEB-INF/view/");
        return viewResolver;
    }
}

