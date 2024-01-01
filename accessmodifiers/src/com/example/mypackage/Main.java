package com.example.mypackage;

public class Main {

    public static void main(String[] args) {
        System.out.println(Accessible.SOME_CONSTANT);
        Account timsAccount=new Account("Tim");
        timsAccount.deposit(1000);
        timsAccount.withdrawl(500);
        timsAccount.withdrawl(-200);
        timsAccount.deposit(-20);
        System.out.println("Balance on account is "+timsAccount.calculateBalance());
    }
}
