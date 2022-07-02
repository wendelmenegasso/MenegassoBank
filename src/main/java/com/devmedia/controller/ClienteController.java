package com.devmedia.controller;

import com.devmedia.model.Client;

import com.devmedia.negocio.account.AccountImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

@RestController
public class ClienteController {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    @GetMapping("/addClient")
    String addClient(@RequestParam("name") String name,
                     @RequestParam("secondName") String secondName,
                     @RequestParam("cpf") String cpf,
                     @RequestParam("rg") String rg,
                     @RequestParam("street") String street,
                     @RequestParam("salary") String salary,
                     @RequestParam("cep") String cep,
                     @RequestParam("city") String city,
                     @RequestParam("country") String country,HttpServletResponse response) throws Exception
    {
        Client client = new Client();
        AccountImpl account = new AccountImpl();
        account.createAccount(name,secondName,cpf,rg,new BigDecimal(salary),street,cep,city,country);
        client.setAccount(account);
        logger.debug("Cadastrado com sucesso",client);
        response.sendRedirect("/successAddClient");
        return "/successAddClient";
    }
}
