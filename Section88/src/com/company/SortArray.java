package com.company;

import java.util.Scanner;

public class SortArray {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        int[] a=getIntegers(5);
//        printArray(a);
        int []b=sortIntegers(a);
        printArray(b);

    }

    public static int[] getIntegers(int capacity){
        int[] a=new int[capacity];
        for(int i=0;i<capacity;i++)
            a[i]=scanner.nextInt();

        return a;
    }
    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println("Element "+i+" contents "+a[i]);
        }
    }

//for duplication of array we can use
//java.util.Arrays.copyof(original array,length to be copied)
//java.util.Arrays.copyOfRange(original,start,end);
    public static int[] sortIntegers(int[] array){ //insertion sort
        int[] sortedArray=new int[array.length];
        for(int i=0;i< array.length;i++){
           sortedArray[i]=array[i];
           for(int j=i;j>0;j--){
               if(sortedArray[j]>sortedArray[j-1]){
                   int temp=sortedArray[j-1];
                   sortedArray[j-1]=sortedArray[j];
                   sortedArray[j]=temp;
               }
               else {
                   break;
               }
           }
            }
        return sortedArray;
        }
}
