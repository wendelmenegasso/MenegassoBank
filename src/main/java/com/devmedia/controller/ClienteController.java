package com.devmedia.controller;

import com.devmedia.model.Cliente;
import org.apache.catalina.core.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@RestController

public class ClienteController{
    private static final Logger logger = LoggerFactory.getLogger(Cliente.class);
    @GetMapping("/login")
    String login() {
        return "login";
    }

}
