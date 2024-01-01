package com.company;

public class Main {

    public static void main(String[] args) {
    ////////////////////////////////////////
        double amount=12618.98;
        double interestRate=0.0013;
        double interest=amount*interestRate;
        System.out.println("Interest is $"+interest);
//        System.out.println("Interest is $%10.2s",interest); //will not work
        System.out.println("Interest is $"+(int)(interest*100)/100.0);
        System.out.printf("Interest is $%-10.2f",(int)(interest*100)/100.0);
    ////////////////////////////////////////
    ////////////////////////////////////////
    ////////////////////////////////////////
    ////////////////////////////////////////
    }
}
