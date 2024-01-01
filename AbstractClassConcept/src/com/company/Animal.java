package com.company;

public abstract class Animal {
    private String name;
    public Animal(String name){ //no default ctor so Dog must call one arg Ctor else compile error
        this.name=name;
    }
    public abstract void eat();
    abstract public void breathe();

    public String getName(){
        return name;
    }
}
