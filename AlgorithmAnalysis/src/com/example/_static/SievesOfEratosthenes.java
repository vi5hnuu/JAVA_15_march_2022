package com.example._static;

import java.util.Scanner;

public class SievesOfEratosthenes {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Find all prime numbers<=n ,enter n:");
        int n=scn.nextInt();

        boolean[] primes=new boolean[n+1];
        for(int i=0;i<primes.length;i++){
            primes[i]=true;
        }

        for(int k=2;k<=n/k;k++){
            if(primes[k]){
                for(int i=k;i<=n/k;i++)
                    primes[k*i]=false;
            }
        }


    final  int NUMBER_PER_LINE=10;
    int count=0;

    for(int i=2;i<primes.length;i++){
        if(primes[i]){
            count++;
            if (count % NUMBER_PER_LINE == 0)
                 System.out.printf("%7d\n", i);
             else
             System.out.printf("%7d", i);
        }
    }
        System.out.println("\ncount "+"prime(S) less then or equal to "+n);
    }
}
