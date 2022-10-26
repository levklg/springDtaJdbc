package com.example.springDataJdbc.sessionmanager;

public interface TransactionManager {

    <T> T doInTransaction(TransactionAction<T> action);
}
