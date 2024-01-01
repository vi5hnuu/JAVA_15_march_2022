package com.example._static;

import java.util.Scanner;

public class GCDBruteForce {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter two Numbers :");
        int n1,n2;
        n1= scn.nextInt();
        n2= scn.nextInt();
        System.out.println(gcd(n1,n2));
    }

    public static int gcd(int n1,int n2){
        if(n1<0 || n2<0)
            return -1;

        int gcd=1;
        for(int k=2;k<=n1 && k<=n2;k++){
            if(n1%k==0 && n2%k==0)
                gcd=k;
        }
        return gcd;
    }
}
