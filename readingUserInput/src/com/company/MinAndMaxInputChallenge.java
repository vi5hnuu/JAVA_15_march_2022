package com.company;
import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public  static void MinMaxPrint(){
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    Scanner scn=new Scanner(System.in);
    int data=0;
    while(true) {
        System.out.print("Enter the number :");
        boolean valid=scn.hasNextInt();
        if(valid){
        data=scn.nextInt();
        if(data<min)
            min=data;
        if(data>max)
            max=data;
        }else{
            break;
        }
        scn.nextLine();
    }
    scn.close();
        System.out.println("MAXIMUM VALUE ENTERED SO FAR :"+max);
        System.out.println("MINIMUM VALUE ENTERED SO FAR :"+min);
    }
}
