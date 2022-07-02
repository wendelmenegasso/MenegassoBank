package com.devmedia.model.database;

import redis.clients.jedis.Jedis;

public interface Database{
    boolean isConnected(String user, String password);
    Jedis connect(String host, int port) throws DatabaseException;
    void disconnect(String user, String password);
}
