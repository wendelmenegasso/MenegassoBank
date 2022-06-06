package com.devmedia.negocio.account;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class AccountImplTest {
    AccountImpl account = null;
    @Before
    public void setup(){
        account = new AccountImpl();
    }
    @Test
    public void transact(){
        Assert.assertTrue(account.setValue("0110","010123",200.25));
        Assert.assertEquals(account.getValue("0110","0721230"),new BigDecimal("1100"));
    }
}
