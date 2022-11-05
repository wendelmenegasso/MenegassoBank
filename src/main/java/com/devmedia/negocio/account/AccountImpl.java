package com.devmedia.negocio.account;

import org.springframework.data.redis.core.RedisHash;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("AccountImpl")
public class AccountImpl implements Account, Serializable {

    private AccountValuesImpl account;

    public AccountImpl(AccountValuesImpl account){
        this.account = account;
    }


    @Override
    public BigDecimal getValueInTheAccount() {
        return account.getValueInTheAccount();
    }

    @Override
    public void setValueIntTheAccount(BigDecimal addValueInTheAccount) {
        account.setValueInTheAccount(account.getValueInTheAccount().add(addValueInTheAccount));
    }

    @Override
    public String createAccount() throws java.lang.IllegalArgumentException {
        AccountValuesImpl account = this.account;
        this.account.getDatabase().save(account);
        return "Criado";
    }

    @Override
    public boolean findAccount() {
        return true;
    }

    @Override
    public String toString(){
        return "<h1>Cadastrado com sucesso:</h1>\nNome: "+this.account.getFirstName()+
                "<br> Sobrenome: "+this.account.getSecondName()+
                "<br> RG: "+ this.account.getRG()+
                "<br> CPF: "+ this.account.getCPF()+
                "<br> Cidade: " + this.account.getCity()+
                "<br> Rua: " + this.account.getStreet()+
                "<br> CEP: " + this.account.getCEP()+
                "<br> País: " + this.account.getCountry()+
                "<br><form action=/successAddClient method=GET>" +
                "<input type=\"submit\" value=\"Submit\"/> " +
                "</form>";
    }



}
