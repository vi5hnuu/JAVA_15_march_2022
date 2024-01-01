package com.company;

import java.util.Scanner;

public class Strinread {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
//        String name=input.nextLine(); //give  "   vishnu"
//        System.out.println(name);

        int x=input.nextInt();
        String name=input.nextLine(); //"123 vishnu kumar" //"123 \n vishnu" //notice space
        System.out.println(x);
        System.out.println(name);

        //tokens leave space and \n
        //nextline read space and terminate if ready \n
    }
}
