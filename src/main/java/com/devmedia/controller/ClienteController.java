package com.devmedia.controller;

import com.devmedia.model.Client;

import com.devmedia.negocio.account.AccountImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

@RestController
public class ClienteController {
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
        response.sendRedirect("/successAddClient");
        return "/successAddClient";
    }
}
