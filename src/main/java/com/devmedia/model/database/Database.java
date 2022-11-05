package com.devmedia.model.database;

import com.devmedia.negocio.account.AccountValuesImpl;
import org.springframework.stereotype.Repository;

@Repository
public interface Database extends CrudRepository<AccountValuesImpl, String> {
    <S extends AccountValuesImpl> S save(S entity);
}
