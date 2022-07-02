package com.devmedia.model;

import com.devmedia.negocio.account.AccountImpl;
import com.devmedia.negocio.extract.ExtractImpl;
import org.springframework.stereotype.Component;

@Component
public class Client {

    private AccountImpl account;
    private ExtractImpl extract;

    public ExtractImpl getExtract() {
        return extract;
    }

    public void setExtract(ExtractImpl extract) {
        this.extract = extract;
    }

    public AccountImpl getAccount() {
        return account;
    }

    public void setAccount(AccountImpl account) {
        this.account = account;
    }
}