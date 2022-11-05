package com.devmedia.controller;

import com.devmedia.model.database.DatabaseImpl;
import com.devmedia.negocio.account.AccountImpl;
import com.devmedia.negocio.account.AccountValuesImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class ClienteController {
    @GetMapping("/addClient")
    String addClient(@RequestParam("name") String firstName,
                     @RequestParam("secondName") String secondName,
                     @RequestParam("cpf") String cpf,
                     @RequestParam("rg") String rg,
                     @RequestParam("street") String street,
                     @RequestParam("salary") String salary,
                     @RequestParam("cep") String cep,
                     @RequestParam("city") String city,
                     @RequestParam("country") String country,HttpServletResponse response) throws Exception
    {
        AccountValuesImpl accountValues = new AccountValuesImpl();
        DatabaseImpl database = new DatabaseImpl();
        accountValues.setDatabase(database);
        accountValues.setCEP(cep);
        accountValues.setCity(city);
        accountValues.setCountry(country);
        accountValues.setFirstName(firstName);
        accountValues.setSecondName(secondName);
        accountValues.setRG(rg);
        accountValues.setCPF(cpf);
        accountValues.setStreet(street);
        AccountImpl account = new AccountImpl(accountValues);
        return account.createAccount();
    }
}
