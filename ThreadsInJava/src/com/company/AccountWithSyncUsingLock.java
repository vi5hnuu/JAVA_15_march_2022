package com.company;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class AccountWithSyncUsingLock {
    private static Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++)
            executorService.execute(new AddAPennyTask());

        executorService.shutdown();
        while (!executorService.isTerminated()){}
        System.out.println("What is balance ? "+account.getBalance());
    }


public static class AddAPennyTask implements Runnable{
    public void run(){
        account.deposit(2);
    }
}

public static class Account{
    private static Lock lock=new ReentrantLock();
    private int balance=0;
    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        lock.lock();
        try{
            int newBalance=balance+amount;
            Thread.sleep(5);
            balance=newBalance;
        }catch (InterruptedException e){}
        finally {
            lock.unlock();
        }
    }
}
}
