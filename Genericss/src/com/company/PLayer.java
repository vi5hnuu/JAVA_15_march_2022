package com.company;

public abstract class PLayer {
    private String name;

    public PLayer(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
