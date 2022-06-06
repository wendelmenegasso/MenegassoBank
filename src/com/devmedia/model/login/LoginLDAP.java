package com.devmedia.model.login;

public class LoginLDAP  implements Login{
    @Override
    public boolean verifyCredentials(String user, String password) {
        return false;
    }
}
