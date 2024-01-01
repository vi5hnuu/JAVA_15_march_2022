package com.company;
import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        long sum=0;
        long count=0;
        Scanner scn=new Scanner(System.in);
        boolean isvalid=false;
        while(true){
            isvalid=scn.hasNextInt();
            if(isvalid){
                sum+=scn.nextInt();
                count++;
            }
            else{
                break;
            }
            scn.nextLine(); //handle new line character
        }
        System.out.println("SUM = "+sum+" AVG = "+Math.round(sum/(count*1.0)));
    }
}
