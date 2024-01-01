package com.example.mypackage;

import java.util.ArrayList;

public class Account { //package level modifier
    private String accountNumber;  //object level modifiers
    private int balance=0;
    private ArrayList<Integer> transactions;

    public Account(String accountNumber){
        this.accountNumber=accountNumber;
        this.transactions=new ArrayList<>();
    }

    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        if(amount>0){
            transactions.add(amount);
            this.balance+=amount;
            System.out.println("Amount deposited :Cur balance :"+balance);
        }else{
            System.out.println("Cannot deposit the money");
        }
    }
    public void withdrawl(int amount){
        if(balance>=amount && amount>0){
            this.transactions.add(-amount);
            this.balance-=amount;
            System.out.println(amount+" withdrawn");
        }else{
            System.out.println("Failed to withdraw ");
        }
    }
    public int calculateBalance(){
        System.out.println("balance is "+this.balance);
        this.balance=0;
        for(int i:this.transactions){
            this.balance+=i;
        }
        System.out.println("balance is "+this.balance);
        return balance;
    }
}
