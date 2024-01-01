package com.example._static;

public class StaticTest {
//    private int numInstances;
    private static int numInstances;
    private String name;

    public StaticTest(String name){
        this.name=name;
        numInstances++;
    }
//    public int getNumInstances(){ //ok
//        return numInstances;
//    }
    public static int getNumInstances(){//also ok
        return numInstances;
    }
}
