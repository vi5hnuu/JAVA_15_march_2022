package com.company;

import java.util.Scanner;

public class ComputerFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();

         // Find and display the Fibonacci number
        System.out.println("The Fibonacci number at index "+ index + " is " + fibonacci(index));
    }
    public static long fibonacci(int index){
        if(index==0)
            return 0;
        else if(index==1)
            return 1;
        else{
            return fibonacci(index-2)+fibonacci(index-1);
        }
    }
}
