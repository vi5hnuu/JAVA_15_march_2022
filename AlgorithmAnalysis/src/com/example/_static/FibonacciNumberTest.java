package com.example._static;

public class FibonacciNumberTest {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    public static long fib(long index){
        if(index==0)
            return 0;
        if(index==1)
            return 1;
        else
            return fib(index-1)+fib(index-2);
    }
}
