package com.example._static;

import java.util.Scanner;

public class ImprovedGcdV2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter two Numbers :");
        int n1,n2;
        n1= scn.nextInt();
        n2= scn.nextInt();
        System.out.println(gcd(n1,n2));
    }

    public static int gcd(int m,int n){
        int gcd=1;
        if(m<0 || n<0)
            return -1;

        int min=m<n ? m : n;

        if(m%min==0 && n%min==0)
            return min;

        for(int k=min/2;k>=1;k--){
            if (m % k == 0 && n % k == 0){gcd=k;break;}
        }
        return gcd;
    }
}
