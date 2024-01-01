package com.example._static;

import java.util.Scanner;

public class GcdEuclids {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter two Numbers :");
        int n1,n2;
        n1= scn.nextInt();
        n2= scn.nextInt();
        System.out.println(gcd(n1,n2));
    }

    public static int gcd(int m,int n){
        if(m%n==0)
            return n;
        else
            return gcd(n,m%n);
    }
}
