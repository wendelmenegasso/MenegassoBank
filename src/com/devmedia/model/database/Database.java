package com.devmedia.model.database;

import com.devmedia.model.login.LoginDatabase;

public interface Database{
    boolean isConnected(String user, String password);
    boolean connect(String user, String password) throws DatabaseException;
    void disconnect(String user, String password);
}
