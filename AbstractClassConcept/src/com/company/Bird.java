package com.company;

public abstract class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println(getName()+" is pecking");
    }
    @Override
    public void breathe(){
        System.out.println("Breath in, Breathe out ,repeat");
        String x="";
    }
//    public abstract void fly(); //not all birds can fly so make it interface

}
