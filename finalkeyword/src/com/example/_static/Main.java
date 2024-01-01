package com.example._static;

public class Main {

    public static void main(String[] args) {
//        SomeClass a1=new SomeClass("One");
//        SomeClass a2=new SomeClass("Two");
//        SomeClass a3=new SomeClass("Three");


//        int pswd=674315;
//        Password password=new Password(pswd);
//        password.storePassword();
//        password.letMeIn(pswd);
//        password.letMeIn(pswd+1);

//        //security breach
//        int pswd=674315;
//        Password password=new ExtendPassword(pswd);
//        password.storePassword();
//        password.letMeIn(pswd);
//        password.letMeIn(pswd+1);
//
//        System.out.println(((ExtendPassword)(password)).getPassword());
//        //so make method final (if we make class final no class can extend it that not something we want)

        System.out.println("Main method called");
        SIBT test1=new SIBT();
        test1.someMethod();
        SIBT test2=new SIBT();
        test2.someMethod();
        System.out.println("Owner is "+SIBT.owner);
    }
}










