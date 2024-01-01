package com.company;

import java.util.Scanner;

public class MinElementChallenge {
private static Scanner input=new Scanner(System.in);
public static void main(String[] args){
    System.out.println("Enter count:");
    int count=input.nextInt();
    int a[]=readIntegers(count);
    System.out.println("min = "+findMin(a));
    input.close();
}

private static int findMin(int[] x){
    int min=Integer.MAX_VALUE;
    for(int i=0;i<x.length;i++)
        if(x[i]<min)
            min=x[i];
        return min;
}
private static int[] readIntegers(int count){
        int[] a=new int[count];
        for(int i=0;i<count;i++){
            System.out.println("Enter ");
            a[i]=input.nextInt();
        }
        return a;
    }
}
