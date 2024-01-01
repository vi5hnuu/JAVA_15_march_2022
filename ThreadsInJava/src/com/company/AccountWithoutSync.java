package com.company;

import java.util.concurrent.*;

public class AccountWithoutSync {
    private static Account account=new Account();
    public static void main(String[] args) {
        ExecutorService executorService=Executors.newCachedThreadPool();
        for(int i=0;i<100;i++)
            executorService.execute(new AddAPennyTAsk());
    executorService.shutdown();
    while (!executorService.isTerminated()){}
        System.out.println("What is balance : "+account.getBalance());
    }
    private static  class AddAPennyTAsk implements Runnable{
        public void run(){ //or
            synchronized (account){
            account.deposit(1);
            }
        }
    }

    private static class Account{
        private int balance=0;
        public int getBalance(){
            return balance;
        }
//        public synchronized void deposit(int amount){
        public  void deposit(int amount){
            int newbalance=balance+amount;
            try{
                Thread.sleep(5);
            }catch (InterruptedException e){}
        balance=newbalance;
        }
    }
}
