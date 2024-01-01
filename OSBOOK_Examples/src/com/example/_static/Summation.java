package com.example._static;

import java.util.concurrent.Callable;

public class Summation implements Callable<Integer> {
    private int upper;
    public Summation(int upper){
        this.upper=upper;
    }
    @Override
    public Integer call() throws InterruptedException{
        int sum=0;
//        Thread.sleep(55000);
        for(int i=1;i<=upper;i++){
            sum+=i;
        }
        return sum;
    }
}
