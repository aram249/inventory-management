package com.ims.app.model;

public class Product {

    private String id;
    private String name;
    private double price;
    private String description;
    private int quantity; 

    // no argument constructor (used to initialize)
    public Product(){}

    // constructor with arguments
    public Product(String id, String name, double price, String description, int quantity){
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    // getters and setters
    public String getId() {
        return id;
    }

    public void setProductId(String id){
        this.id = id;
    }

    public String getProductName(){
        return name;
    }

    public void setProductName(String name){
        this.name = name;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
