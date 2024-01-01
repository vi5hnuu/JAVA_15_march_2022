package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String branchName){
        this.name=branchName;
        this.customers=new ArrayList<>();
    }
    public ArrayList<Customer> getCustomers(){
        return customers;
    }
    public String getName(){
        return name;
    }
    public boolean newCustomer(String customerName,double initialAmount){
        if(findCustomer(customerName)==null){
            this.customers.add(new Customer(customerName,initialAmount));
            return true;
        }else{
            return false;
        }
    }
    public boolean addTransaction(String customerName,double amount){
        Customer existingCustomer=findCustomer(customerName);
        if(existingCustomer!=null){
            existingCustomer.addTransaction(amount);
            return true;
        }else
            return false;
    }
    private Customer findCustomer(String  customerName){
        for(int i=0;i<customers.size();i++){
            Customer checkedCustomer=this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName))
                return checkedCustomer;
        }
        return null;
    }
}
