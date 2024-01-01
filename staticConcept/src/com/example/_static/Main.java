package com.example._static;

public class Main {

    public static void main(String[] args) {
        StaticTest one=new StaticTest("1st");
//        System.out.println(one.getNumInstances());
        System.out.println(StaticTest.getNumInstances());
        StaticTest two=new StaticTest("2nd");
//        System.out.println(two.getNumInstances());
        System.out.println(StaticTest.getNumInstances());
        StaticTest three=new StaticTest("3rd");
//        System.out.println(three.getNumInstances());
        System.out.println(StaticTest.getNumInstances());
        StaticTest four=new StaticTest("4th");
//        System.out.println(four.getNumInstances());
        System.out.println(StaticTest.getNumInstances());

    }
}
