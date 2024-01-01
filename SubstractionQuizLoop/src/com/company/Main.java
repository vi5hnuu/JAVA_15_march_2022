package com.company;

import java.util.Scanner;

//public class Main {
//
//    public static void main(String[] args) {
//	final int NUMER_OF_QUESTIONS=5;
//	int correctCounnt=0;
//	int count=0;
//	long startTime=System.currentTimeMillis();
//	String output="";
//        Scanner scn=new Scanner(System.in);
//        while (count<NUMER_OF_QUESTIONS){
//            int number1=(int)(Math.random()*10);
//            int number2=(int)(Math.random()*10);
//            if(number1<number2){
//                int temp=number1;
//                number2=number1;
//                number1=temp;
//            }
//            System.out.print(number1+" - "+number2+" = ");
//            int ans=scn.nextInt();
//            if(ans==number1-number2){
//                correctCounnt++;
//                System.out.println("Correct !");
//            }
//            else{
//                System.out.println("Wrong !\nCorrect ans would be "+(number1-number2));
//            }
//            count++;
//        }
//        long stopTime=System.currentTimeMillis();
//        scn.close();
//        System.out.println("Total correct answers "+correctCounnt);
//        System.out.println("Total time taken :"+(stopTime-startTime)/1000+"sec");
//    }
//}


public class Main {
 /** Main method */
         public static void main(String[] args) {
         // Create a Scanner
         Scanner input = new Scanner(System.in);

         // Read an initial data
         System.out.print("Enter an integer (the input ends if it is 0): ");
         int data = input.nextInt();

         // Keep reading data until the input is 0
         int sum = 0;
         while (data != 0) {
             sum += data;

             // Read the next data
             System.out.print(
             "Enter an integer (the input ends if it is 0): ");
             data = input.nextInt();
             }

         System.out.println("The sum is " + sum);
        }
 }
