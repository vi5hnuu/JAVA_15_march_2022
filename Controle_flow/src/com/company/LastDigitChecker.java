package com.company;

public class LastDigitChecker {
    public static  boolean hasSameLastDigit(int x,int y,int z){
        if(isValid(x) && isValid(y) && isValid(z)) {
            int lastDigit_x=x%10;
            int lastDigit_y=y%10;
            int lastDigit_z=z%10;
            if(lastDigit_x==lastDigit_y || lastDigit_x==lastDigit_z || lastDigit_y==lastDigit_z)
                return true;
            else
                return false;
        }
        else{
            return false;
        }
    }

    public static boolean isValid(int x){
        if(x>=10 && x<=1000)
            return true;
        else
            return false;
    }
}
