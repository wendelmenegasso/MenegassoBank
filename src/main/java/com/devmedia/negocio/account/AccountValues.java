package com.devmedia.negocio.account;

import com.devmedia.model.database.Database;

import java.math.BigDecimal;

public interface AccountValues {
    void setFirstName(String firstName);
    void setSecondName(String secondName);
    void setCPF(String cpf);
    void setRG(String rg);
    void setSalary(BigDecimal salary);
    void setStreet(String street);
    void setCEP(String cep);
    void setCity(String city);
    void setCountry(String country);
    void setDatabase(Database database);
    void setValueInTheAccount(BigDecimal valueInTheAccount);
    void setAccountNumber(int accountNumber);
    void setAgency(int agency);
    String getFirstName();
    String getSecondName();
    String getCPF();
    String getRG();
    BigDecimal getSalary();
    String getStreet();
    String getCEP();
    String getCity();
    String getCountry();
    Database getDatabase();
    BigDecimal getValueInTheAccount();
    int getAccountNumber();
    int getAgency();
}
