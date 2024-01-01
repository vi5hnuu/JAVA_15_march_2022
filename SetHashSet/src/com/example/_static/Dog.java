package com.example._static;

public class Dog {
    private final  String name;

    public Dog(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    @Override
    public final boolean equals(Object obj){
        if(this==obj)
            return true;

        if(obj instanceof Dog){
            String objeName=((Dog)obj).name;
            return this.name.equals(objeName);
        }

            return false;
    }
}
