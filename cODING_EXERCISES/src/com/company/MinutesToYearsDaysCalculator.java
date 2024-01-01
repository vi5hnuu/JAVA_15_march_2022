package com.company;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes<0)
            System.out.println("Invalid Value");
        else{
        long days=minutes/(60*24);
        long years=days/365;
        long remDays=days-years*365;
            System.out.println(minutes+" min = "+years+" y and "+remDays+" d");
        }
    }
}
