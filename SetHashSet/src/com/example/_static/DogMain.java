package com.example._static;

public class DogMain {
    public static void main(String[] args) {
        Labrador rover=new Labrador("Rover");
        Dog rover2=new Dog("Rover");
        System.out.println(rover2.equals(rover));//true
        System.out.println(rover.equals(rover2));//false
        //but equals method must be symmetric....
        //to remove this violation remove the equals method from Labrodor
        //also make equals final in Dog so that it cannot be overridden in Labrodor

    }
}
