package com.company;

import java.util.Scanner;

public class Waitertip {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int amt=scn.nextInt();
        int quality= scn.nextInt();
        int tip=0;
    switch (quality){
        case(1):tip=5*amt/100;break;
        case(2):tip=10*amt/100;break;
        case(3):tip=15*amt/100;break;
        case(4):tip=20*amt/100;break;
        case(5):tip=25*amt/100;break;
    }

        System.out.println(tip);
    }
}
