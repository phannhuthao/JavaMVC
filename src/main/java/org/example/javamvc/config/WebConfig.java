package org.example.javamvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
// quét tất cả các file phát hiện dùng @, controller để tạo bean cho mình
@ComponentScan(basePackages = "org.example.javamvc")
public class WebConfig {
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/Session8/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}