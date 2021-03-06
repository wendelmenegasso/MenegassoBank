package com.devmedia.controller;

import com.devmedia.model.Client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController

public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);
    @GetMapping("/loginFailure")
    String loginFailure() {
        return "login falhou";
    }
    @GetMapping("/logout")
    String logout() {
        return "logout";
    }
    @GetMapping("testLogin")
    String testLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        if(userName.equals("wendel") && (password.equals("123456"))){
            response.sendRedirect("/home");
            return "/home";
        }
        else{
            response.sendRedirect("/loginFailure");
            return "/loginFailure";
        }
    }
}
