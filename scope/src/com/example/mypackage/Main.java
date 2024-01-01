package com.example.mypackage;

public class Main {

    public static void main(String[] args) {
        String varFour="this is private to main()";

        ScopeCheck scopeCheck=new ScopeCheck();
        scopeCheck.useInner();
        System.out.println("Scopeinstance varone is "+scopeCheck.getVarOne());;
        System.out.println("varFour in main '"+varFour+"'");
        scopeCheck.timesTwo();
        System.out.println("*******************************************");
        ScopeCheck.InnerClass innerClass=scopeCheck.new InnerClass();
        innerClass.timesTwo();
    }
}
