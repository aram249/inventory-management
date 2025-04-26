package com.ims.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    private Long customerId; 
    private String name;
    private String email;

    public Customer(){

    }

    public Customer(Long customerId, String name, String email){
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    public Long getCustomerId(){
        return customerId;
    }
    public void setCustomerId(Long customerId){
        this.customerId = customerId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
