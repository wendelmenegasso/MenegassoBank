package com.devmedia.model.database;

import com.devmedia.negocio.account.AccountValuesImpl;
import java.util.Optional;

public class DatabaseImpl implements Database{


    @Override
    public <S extends AccountValuesImpl> S save(S entity) {
        return entity;
    }


    @Override
    public Optional<AccountValuesImpl> findById(String s) {
        return Optional.empty();
    }


    @Override
    public void delete(AccountValuesImpl entity) {

    }

}
