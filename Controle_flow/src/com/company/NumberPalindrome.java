package com.company;

public class NumberPalindrome {
    public static  boolean isPalindrome(int number){
        int rev_number=0;
        int orig_num=number;
        while(number!=0){
            int digit=number%10;
            number/=10;
            rev_number=rev_number*10+digit;
        }
        if(rev_number==orig_num)
            return true;
        else
            return  false;
    }
}
