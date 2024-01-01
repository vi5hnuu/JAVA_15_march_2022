package com.example._static;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) {
	    int upper=10;
        ExecutorService poll= Executors.newSingleThreadExecutor();
        Future<Integer> result=poll.submit(new Summation(upper));//it will wait for result
        try{
            System.out.println("Sum "+result.get());
        }catch (InterruptedException |ExecutionException e){
            e.printStackTrace();
        }
    }
}
