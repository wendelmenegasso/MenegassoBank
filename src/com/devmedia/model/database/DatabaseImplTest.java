package com.devmedia.model.database;

import org.junit.Assert;
import org.junit.Test;

public class DatabaseImplTest{
    @Test
    public void testConnectPositiveWay() throws DatabaseException{
        DatabaseImpl database =  new DatabaseImpl();
        Assert.assertTrue(database.connect("admin","123456"));
    }
}