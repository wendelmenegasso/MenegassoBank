package com.devmedia.negocio.account;

import java.io.NotSerializableException;
import java.math.BigDecimal;

public interface Account {
    BigDecimal getValueInTheAccount();
    void setValueIntTheAccount(BigDecimal addValueInTheAccount);
    String createAccount() throws NotSerializableException;
    boolean findAccount();
}
