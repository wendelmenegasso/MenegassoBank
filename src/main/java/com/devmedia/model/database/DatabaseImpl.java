package com.devmedia.model.database;

import com.devmedia.model.login.LoginDatabase;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;

public class DatabaseImpl implements Database{

    private LoginDatabase loginDatabase;

    @Override
    public boolean isConnected(String user, String password) {
        return false;
    }

    @Override
    public Jedis connect(String host, int port) throws DatabaseException {
        HostAndPort hostAndPort = new HostAndPort(host,port);
        Jedis jedis = new Jedis(hostAndPort);
        return jedis;
    }

    @Override
    public void disconnect(String user, String password) {

    }
}
