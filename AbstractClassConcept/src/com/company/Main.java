package com.company;

public class Main {


    public static void main(String[] args) {
        Animal dog=new Dog("Yokie");
        dog.breathe();
        dog.eat();

//        Bird parrot=new Parrot("Parrot");
//        parrot.breathe();
//        parrot.eat();
//        parrot.fly();
//
//        Bird penguin=new Penguin("Penguin");
//        penguin.breathe();
//        penguin.eat();
//        penguin.fly();

        //after making fly method in interface
        Bird parrot=new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        ((CanFly)parrot).fly();

        Bird penguin=new Penguin("Penguin");
        penguin.breathe();
        penguin.eat();
        ((CanFly)penguin).fly();


    }
}
