package com.devmedia.model.login;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginTest extends LoginLocal {

    LoginLocal loginLocal;
    LoginLDAP loginLDAP;
    LoginDatabase loginDatabase;

    @Before
    public void setUp() throws Exception {
        loginLocal = new LoginLocal();
        loginLDAP = new LoginLDAP();
        loginDatabase = new LoginDatabase();
    }

    @Test
    public void testVerifyCredentialsInLoginLocal() {
        Assert.assertEquals(true,loginLocal.verifyCredentials("admin","123456"));
    }
}