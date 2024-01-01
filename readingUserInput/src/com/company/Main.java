package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    try{
//        Scanner scn=new Scanner(System.in);
//        System.out.print("Enter your year of birth :");
//            boolean is_next_input_is_int=scn.hasNextInt();
//        if(is_next_input_is_int){
//            int yearOfBirth=scn.nextInt();
//        if(2022-yearOfBirth<0 || 2022-yearOfBirth>100){
//            System.out.println("Invalid age");
//            return;
//        }
//
//
//        scn.nextLine(); //necessary
//        System.out.print("Enter your name :");
//	    String name=scn.nextLine();
//        System.out.println("My name is "+name+"\nAge :"+(2022-yearOfBirth));
//
//        scn.close();
//    }else{
//            System.out.println("Age must be integer");
//	    }
//	    }
//	    catch (InputMismatchException e){
//            System.out.println("Invalid input.");
//        }
    ///////////////////////////////////////////////////
//        ReadinInputChallenge.printScanTenNumberAndSum();
        ///////////////////////////////////////////////////
//        MinAndMaxInputChallenge.MinMaxPrint();
        ///////////////////////////////////////////////////
//            InputCalculator.inputThenPrintSumAndAverage();
        ///////////////////////////////////////////////////
        System.out.println(PaintJob.getBucketCount(2.75,3.25,2.5,1));
        System.out.println(PaintJob.getBucketCount(3.4,2.1,1.5,2));
        System.out.println(PaintJob.getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(PaintJob.getBucketCount(0.0,2.1,1.5,7));

        System.out.println(PaintJob.getBucketCount(7.25,4.3,2.35));
        System.out.println(PaintJob.getBucketCount(3.4,2.1,1.5));
        System.out.println(PaintJob.getBucketCount(-3.4,2.1,1.5));

        System.out.println(PaintJob.getBucketCount(3.4,1.5));
        System.out.println(PaintJob.getBucketCount(6.26,2.2));
        System.out.println(PaintJob.getBucketCount(3.26,0.75));

    }
}
