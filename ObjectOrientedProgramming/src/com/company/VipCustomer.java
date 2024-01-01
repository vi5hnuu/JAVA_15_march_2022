package com.company;

public class VipCustomer {
    private String name,email;
    private long creditLimit;

    public VipCustomer(String name,String email,long creditLimit){
        this.name=name;
        this.email=email;
        this.creditLimit=creditLimit;
        System.out.println("Three arg ctor is called.");

    }
    public VipCustomer(){
        this("xyz","xyz@gmail.com",0);
        System.out.println("Zero arg ctor is called.");
    }
    public VipCustomer(String name,String email){
        this(name,email,0);
        System.out.println("Two arg ctor called");
    }

    public String getName(){
        return this.name;
    }
    public  String getEmail(){
        return this.email;
    }
    public long getCreditLimit(){
        return creditLimit;
    }
}
