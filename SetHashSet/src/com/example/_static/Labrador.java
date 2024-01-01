package com.example._static;

public class Labrador extends Dog{
    public Labrador(String name){
        super(name);
    }
//    @Override //after making equals in Dog final it shows error as well
//    public boolean equals(Object obj){
//        if(this==obj)
//            return true;
//
//        if(obj instanceof Labrador){
//            String objeName=((Labrador)obj).getName();
//            return this.getName().equals(objeName);
//        }
//
//        return false;
//    }
}
