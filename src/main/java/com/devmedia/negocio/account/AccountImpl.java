package com.devmedia.negocio.account;

import com.devmedia.model.database.DatabaseException;
import com.devmedia.model.database.DatabaseImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import redis.clients.jedis.Jedis;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountImpl implements Account{

    private String firstName;
    private String secondName;
    private String cpf;
    private String rg;
    private BigDecimal salary;
    private String street;
    private String cep;
    private String city;
    private String country;

    private static final Logger logger = LogManager.getLogger(AccountImpl.class);


    @Override
    public BigDecimal getValue(String accountNumber, String accountAgency) {
        BigDecimal value;
        if(findAccount(accountNumber,accountAgency))value = new BigDecimal(("1100"));
        else {
            value = new BigDecimal("0");
        }
        return value;
    }

    @Override
    public boolean setValue(String accountNumber, String accountAgency, double value) {
        double sum =  value + Double.parseDouble(getValue(accountNumber,accountAgency).toString());
        BigDecimal valueInTheAccount = new BigDecimal(sum);
        return true;
    }

    @Override
    public boolean createAccount(String firstName, String secondName, String cpf, String rg,
                                 BigDecimal salary, String street, String cep, String city,
                                 String country) {
        DatabaseImpl database = new DatabaseImpl();
        try {
            Jedis jedis = database.connect("127.0.0.1",32768);
            List<AccountImpl> accountList = new ArrayList<>();
            this.firstName = firstName;
            this.secondName = secondName;
            this.cpf = cpf;
            this.rg = rg;
            this.salary = salary;
            this.street = street;
            this.cep = cep;
            this.city = city;
            this.country = country;
            AccountImpl account = this;
            accountList.add(account);
            jedis.set("firstName",firstName);
            jedis.set("secondName",secondName);
            jedis.set("cpf",cpf);
            jedis.set("rg",rg);
            jedis.set("salary",salary.toString());
            jedis.set("street",street);
            jedis.set("cep",cep);
            jedis.set("city",city);
            jedis.set("country",country);
            logger.debug("Gravado com sucesso : {}", accountList.get(0)::toString);
        } catch (DatabaseException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean findAccount(String accountNumber, String accountAgency) {
        return true;
    }


}
