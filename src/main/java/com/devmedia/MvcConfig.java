package com.devmedia;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login.html");
        registry.addViewController("/home").setViewName("client.html");
        registry.addViewController("/logout");
        registry.addViewController("/loginFailure");
        registry.addViewController("/addClient");
        registry.addViewController("/successAddClient").setViewName("successAddClient.html");
    }
}
