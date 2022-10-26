package com.example.springDataJdbc.crm.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.lang.NonNull;

@Table("phones")
public class Phone {

    @Id
    private long id;

    @NonNull
    private String number = "";

    @PersistenceCreator
    public Phone(String number){
       this.number = (number);

    }
    @PersistenceCreator
    public Phone(){

    }

    public String getNumber(){
        String s = this.number;
        return s ;
    }



}
