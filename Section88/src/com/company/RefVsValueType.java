package com.company;

import java.util.Arrays;

public class RefVsValueType {
    public static void main(String[] args){
//        int myintValue=10;
//        int anotherIntValue=myintValue;
//        System.out.println(myintValue);
//        System.out.println(anotherIntValue);
//        anotherIntValue++;
//        System.out.println(myintValue);
//        System.out.println(anotherIntValue);

///////////////////////////////////////////////////
///////////////////////////////////////////////////
        int[] myIntArray=new int[5];
        int[] anotherIntArray=myIntArray;
//        System.out.println(myIntArray); //eq to myintarray.toString() [of object class]
//        System.out.println(anotherIntArray);
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherIntArray));
        anotherIntArray[0]=15;
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherIntArray));

        int[] yetAnotherArray=anotherIntArray.clone();//protected method in object class we  make it public by overriding and implementing clonable interface.
        System.out.println("---------------------------");
        System.out.println(Arrays.toString(yetAnotherArray));
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherIntArray));
        anotherIntArray[0]=55;
        System.out.println("---------------------------");
        System.out.println(Arrays.toString(yetAnotherArray));
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherIntArray));
        System.out.println("---------------------------");
        System.out.println(yetAnotherArray==myIntArray);//ref so copare address
        System.out.println(yetAnotherArray==anotherIntArray);//ref so copare address
        System.out.println(anotherIntArray==myIntArray);//ref so copare address
        System.out.println("---------------------------");
        modify(yetAnotherArray);
        System.out.println(Arrays.toString(yetAnotherArray));
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherIntArray));
        System.out.println(yetAnotherArray==myIntArray);//ref so copare address
        System.out.println(yetAnotherArray==anotherIntArray);//ref so copare address
        System.out.println(anotherIntArray==myIntArray);//ref so copare address
    }

//    public static void modify(int[] a){
//        a[0]=99;
//    }
    public static void modify(int[] a){
        a[0]=99;
        a=new int[]{1,2,3};//let say we passd yeAnotherArray
        //initially a point to yetAnother array....modify ist a[0] then
        //a point to another array in heap(yetanotherarray is same in main function its just the connection from modify function is  broken)
        //now a point to new array
        //when function exit new int[]{1,2,3} is collected by java garbage collector as "a"
        //will be deleted and then new int[]{1,2,3} there is no ref to this so java collect it.

        //no ref java garbage will colect it.
    }
}
