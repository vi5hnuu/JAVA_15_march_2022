package com.company;

public class Penguin extends Bird implements CanFly { //penguin is a bird
    public Penguin(String name){
        super(name);
    }
    @Override
    public void fly(){
        System.out.println("Flying me ..hahahaha");
    }
}
