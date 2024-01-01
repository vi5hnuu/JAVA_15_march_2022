package com.example._static;

public class SomeClass {
    public  final int instance_number;//=1; //they have to be initilized because they are final they are not default initilized
    private static int classCounter;
    private final String name; // we use all upercase for static final(class variable)
    static {
        classCounter=0;
    }
    public SomeClass(String name){
        this.name=name;
        classCounter++;
        instance_number =classCounter;
        System.out.println("created instance with instanceNumber "+ instance_number);
    }

    public int getInstanceNumber(){
        return instance_number;
    }

}
