package com.company;

public class NumberToWords {
    public static void numberToWords(int number){
        int digitCount_original=getDigitCount(number);
        number=reverse(number);
        int digitCount_after_reverse=getDigitCount(number);

        if(number<0)
            System.out.println("Invalid Value");
        else if(number==0)
            System.out.println("Zero");
        else {
            while(number!=0){
            int lastDigit=number%10;
            number/=10;
            switch (lastDigit){
                case 0:
                    System.out.println("Zero"); break;
                case 1:
                    System.out.println("One"); break;
                case 2:
                    System.out.println("Two"); break;
                case 3:
                    System.out.println("Three"); break;
                case 4:
                    System.out.println("Four"); break;
                case 5:
                    System.out.println("Five"); break;
                case 6:
                    System.out.println("Six"); break;
                case 7:
                    System.out.println("Seven"); break;
                case 8:
                    System.out.println("Eight"); break;
                case 9:
                    System.out.println("Nine"); break;

            }
            }
        }
        if(digitCount_original>digitCount_after_reverse){
            while(digitCount_original!=digitCount_after_reverse){
                System.out.println("Zero");
                digitCount_original--;
            }
        }
    }

    public static int reverse(int number){
        int reversed_number=0;
        boolean negative=false;
        if(number<0)
            negative=true;
        while(number!=0){
            int digit=number%10;
            number/=10;
            reversed_number=reversed_number*10+digit;
        }
        if(negative)
        return reversed_number>0 ? -reversed_number:reversed_number;
        else
            return reversed_number;
    }

    public static int getDigitCount(int number){
        int count=0;
        if(number<0)
            return -1;
        if(number==0)
            return 1;
        while(number!=0){
            int digit=number%10;
            number/=10;
            count++;
        }
        return count;
    }
}
