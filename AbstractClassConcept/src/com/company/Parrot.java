package com.company;

public class Parrot extends Bird implements CanFly { //penguin is a bird
    public Parrot(String name){
        super(name);
    }
    @Override
    public void fly(){
        System.out.println("Flitting from branch to branch");
    }
}
