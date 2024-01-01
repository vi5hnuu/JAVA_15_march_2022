package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args){
        Calendar calendar=new GregorianCalendar();
        System.out.println("Current time is "+new Date());
        System.out.println("Year "+calendar.get(Calendar.YEAR));
        System.out.println("Year "+calendar.get(Calendar.MONTH));
        System.out.println("Year "+calendar.get(Calendar.DATE));
        System.out.println("Year "+calendar.get(Calendar.HOUR));
        System.out.println("Year "+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Year "+calendar.get(Calendar.MINUTE));
        System.out.println("Year "+calendar.get(Calendar.SECOND));
        System.out.println("Year "+calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Year "+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Year "+calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Year "+calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Year "+calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Year "+calendar.get(Calendar.AM_PM));

        Calendar calendar1=new GregorianCalendar(1997,11,25);
        String[] dayNameOfWeek={"Sunday","Monday","tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("December 25,1947 is a "+dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK)-1]);
    }
}
