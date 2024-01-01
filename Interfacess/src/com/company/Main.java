package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone timePhone; //can only call all func of Itelephone(as at compile time only ITelephone methods are visible not the pointing objects methods)
        //so if you want the methods of pointing obj to call u have to cast..
        timePhone=new DeskPhone(123456);
        timePhone.powerOn();
        timePhone.callPhone(123456);
        timePhone.answer();
        timePhone.where();
        System.out.println("========================");
        ITelephone vishnusPhone;
        vishnusPhone=new MobilePhone(123456);
        vishnusPhone.powerOn();
        vishnusPhone.callPhone(123456);
        vishnusPhone.answer();
        vishnusPhone.where();
    }

}
