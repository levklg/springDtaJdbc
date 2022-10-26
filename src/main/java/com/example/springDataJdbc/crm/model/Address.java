package com.example.springDataJdbc.crm.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.lang.NonNull;


@Table(name = "addresses")
public class Address {

    @Id
    private long id;

   @NonNull
    private String street;


    public Address(Long id, String street) {
        if(id != null)  this.id = id;
        this.street = street;

    }

    public Address(String street) {
         this.street = street;

    }

    public String getStreet() {
        return street;
    }

    public Address(){

    }
}
