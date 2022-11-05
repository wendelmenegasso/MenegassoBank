package com.devmedia.negocio.account;

import com.devmedia.model.database.Database;

import java.math.BigDecimal;

public class AccountValuesImpl implements AccountValues{

    private String firstName;
    private String secondName;
    private String cpf;
    private String rg;
    private BigDecimal salary;
    private String street;
    private String cep;
    private String city;
    private String country;
    private Database database;
    private BigDecimal valueInTheAccount;
    private int accountNumber;
    private int agency;

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setRG(String rg) {
        this.rg = rg;
    }

    @Override
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public void setCEP(String cep) {
        this.cep = cep;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void setDatabase(Database database) {
        this.database = database;
    }

    @Override
    public void setValueInTheAccount(BigDecimal valueInTheAccount) {
        this.valueInTheAccount = valueInTheAccount;
    }

    @Override
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void setAgency(int agency) {
        this.agency = agency;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getSecondName() {
        return secondName;
    }

    @Override
    public String getCPF() {
        return cpf;
    }

    @Override
    public String getRG() {
        return rg;
    }

    @Override
    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public String getCEP() {
        return cep;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public Database getDatabase() {
        return database;
    }

    @Override
    public BigDecimal getValueInTheAccount() {
        return valueInTheAccount;
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public int getAgency() {
        return agency;
    }
}
