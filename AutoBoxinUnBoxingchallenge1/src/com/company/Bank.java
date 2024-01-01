package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name=name;
        this.branches=new ArrayList<>();
    }
    public boolean addBranch(String branchName){
        if(findBranch(branchName)==null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName,String customerName,double initialAmount){
        Branch branch=findBranch(branchName);
        if(branch!=null)
            return branch.newCustomer(customerName,initialAmount);
        return false;
    }
    public boolean addCustomerTransaction(String branchName,String customerName,double amount){
        Branch branch=findBranch(branchName);
        if(branch!=null)
            return branch.addTransaction(customerName,amount);
        return false;
    }
    private Branch findBranch(String branchName){
        for(int i=0;i<branches.size();i++){
            Branch checked=branches.get(i);
            if(checked.getName().equals(branchName))
                return checked;
        }
        return null;
    }

    public boolean listCustomers(String branchName,boolean showTransaction){
        Branch branch=findBranch(branchName);
        if(branch!=null){
            System.out.println("Customers details for branch "+branch.getName());
            ArrayList<Customer> branchCustomers=branch.getCustomers();
            for(int i=0;i<branchCustomers.size();i++){
                Customer branchCustomer=branchCustomers.get(i);
                System.out.print("Customer :"+branchCustomer.getName());
                if(showTransaction){
                    ArrayList<Double> transactions=branchCustomer.getTransaction();
                    System.out.println(" ["+(i+1)+"] ");
                    for(int j=0;j<transactions.size();j++)
                        System.out.println("\t\tTransaction "+(j+1)+" Amount :"+transactions.get(j));
                }
                else
                    System.out.println();
            }
        return true;
        }
        else{
            System.out.println("Branch not found.");
        return false;
        }
    }

}
