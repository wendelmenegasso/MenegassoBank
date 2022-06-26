package com.devmedia.model.database;

public class DatabaseException extends Exception{
    DatabaseException(String databaseException){
        super(databaseException);
    }
}
