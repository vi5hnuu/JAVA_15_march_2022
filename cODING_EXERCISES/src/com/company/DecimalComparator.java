package com.company;

public class DecimalComparator {
    public static boolean areEqualthreeDecimalPlaces(double x,double y){
        if((int)(x*1000)==(int)(y*1000))  //check upto three decimal places
            return true;
        else
            return false;
    }
}
