package com.example._static;

import java.util.Scanner;

public class ImporvedPrimeNumber {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Find all prime numbers <= n, enter n:");
        int n=scn.nextInt();

        final int NUMBER_PER_LINE=10;
        int count=0;
        int number=2;
        System.out.println("The prime numbers are :");
        int sqroot=1;
        while (number<=n){
            boolean isPrime=true;
            if(sqroot*sqroot<number && number%2==0)sqroot++;
            for(int divisor=2;divisor<=sqroot;divisor++){
                if(number%divisor==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                count++;
                if(count%NUMBER_PER_LINE==0)
                    System.out.printf("%7d\n",number);
                else {
                    System.out.printf("%7d",number);
                }
            }
            number++;
        }
        System.out.println("\n"+count+" prime(s) less than or equall to "+n);
    }
}
