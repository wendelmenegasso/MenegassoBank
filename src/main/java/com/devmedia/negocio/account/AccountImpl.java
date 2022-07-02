package com.devmedia.negocio.account;

import com.devmedia.model.database.DatabaseException;
import com.devmedia.model.database.DatabaseImpl;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.math.BigDecimal;

public class AccountImpl implements Account{

    private String firstName;
    private String secondName;
    private String cpf;
    private String rg;
    private String salary;
    private String street;
    private String cep;
    private String city;
    private String country;

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
            Jedis jedis = database.connect("127.0.0.1",32771);
            this.firstName = jedis.set("firstName",firstName);
            this.secondName = jedis.set("secondName",secondName);
            this.cpf = jedis.set("cpf",cpf);
            this.rg = jedis.set("rg",rg);
            this.salary = jedis.set("salary",salary.toString());
            this.street = jedis.set("street",street);
            this.cep = jedis.set("cep",cep);
            this.city = jedis.set("city",city);
            this.country = jedis.set("country",country);
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
