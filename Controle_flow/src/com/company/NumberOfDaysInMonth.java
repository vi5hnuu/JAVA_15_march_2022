package com.company;

public class NumberOfDaysInMonth {
    public static boolean isLeapYEar(int year){
        if(year>=1 && year<=9999){
            if((year%4==0 && year%100!=0) || year%400==0)
                return true;
            else
                return false;
        }
        else
            return false;
    }

    public static int getdaysInMonth(int month,int year){
        if(month<1 || month>12 || year<1 || year>9999)
            return -1;

        boolean isLeap=isLeapYEar(year);
        int days=0;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days=31; break;
            case 4:
            case 6:
            case 9:
            case 11:
             days=30; break;
            case 2:
                if(isLeap)
                    days=29;
                else
                    days=28;
            break;
        }
        return days;

    }
}
