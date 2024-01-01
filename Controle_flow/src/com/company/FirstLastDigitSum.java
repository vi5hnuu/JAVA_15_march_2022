package com.company;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0)
            return -1;
        else if(number<10){
            return 2*number;
        }
        else{
            int sum=number%10;
            number/=10;
            int firsdigit=0;
            while(number!=0){
                firsdigit=number%10;
                number/=10;
            }
            sum+=firsdigit;
            return sum;
        }
    }
}
