package com.company;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;


public class ThreadCoorporation {
private  static Account account=new Account();

    public static void main(String[] args) {
        ExecutorService executorService=Executors.newFixedThreadPool(2);
        executorService.execute(new DepositTast());
        executorService.execute(new WithdrawTask());
        executorService.shutdown();
        System.out.println("Thread1 \t\t Thread2 \t\t blance");
    }

public static class DepositTast implements Runnable{
    @Override
    public void run(){
        try{
            while(true){
                account.deposit((int)(Math.random()*10)+1);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

public static class WithdrawTask implements Runnable{
    @Override
    public void run(){
        while(true){
            account.withdraw((int)(Math.random()*10)+1);
        }
    }
}

private static class Account{
    private static Lock lock=new ReentrantLock();
    private static Condition newDeposit=lock.newCondition();
    private int balance=0;

    public int getBalance(){
        return balance;
    }
    public void withdraw(int amount){
        lock.lock();
        try{
            while(balance<amount){
                System.out.println("\t\t\twait for a deposit");
                newDeposit.await();
            }
            balance-=amount;
            System.out.println("\t\t\twithdraw "+amount+"\t\t"+getBalance());
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        finally {
                lock.unlock();
        }

    }
    public void deposit(int amount){
        lock.lock();
        try{
            balance+=amount;
            System.out.println("Deposit "+amount+"\t\t\t\t\t"+getBalance());

            newDeposit.signalAll();
        }
        finally {
            lock.unlock();
        }
    }
}
}