package com.example._static;

public class SIBT {
    public static final String owner;

    static {
        owner="Time";
        System.out.println("SIBT static block called");
    }
    public SIBT(){
        System.out.println("SIBT ctor called");
    }
    static {
        System.out.println("2nd initilization block called");
    }
    public void someMethod(){
        System.out.println("someMethod called");
    }
}
