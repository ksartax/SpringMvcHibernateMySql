package spring.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by Damian Stępniak on 09.03.2017.
 */

@Configurable
@ComponentScan(basePackages = "spring")
@EnableWebMvc
public class AppConfig {

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setViewClass(JstlView.class);
        internalResourceViewResolver.setSuffix(".jsp");
        internalResourceViewResolver.setPrefix("/WEB-INF/views/");
        return internalResourceViewResolver;
    }

}
