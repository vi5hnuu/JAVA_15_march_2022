package com.company;

import java.util.Scanner;

public class ReadinInputChallenge {
    public static void printScanTenNumberAndSum(){
    int sum=0;
    Scanner scn=new Scanner(System.in);
    boolean hasnextint=false;
    for(int i=0;i<10;i++){
        System.out.print("Enter number #"+(i+1)+":");
        hasnextint=scn.hasNextInt();
       if(hasnextint){
           sum+=scn.nextInt();
       }
       else{
           i-=1;
           System.out.println("Invalid number");
       }
       scn.nextLine(); //handle enter key
    }
        System.out.println(""+sum);
    scn.close();
}
}
