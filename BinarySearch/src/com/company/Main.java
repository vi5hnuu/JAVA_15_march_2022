package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5,6,7,8};
//        System.out.println(array[BinarySearchAlgo.binarySearch(array,7)]);
        int index=BinarySearchAlgo.binarySearch(array,9);
//        int index=BinarySearchAlgo.binarySearch(array,8);
        if(index<0)
            System.out.println("Not found\nTo maintain order insert at index "+(-(index+1)));
        else
            System.out.println("Found at index :"+index);
    }
}
