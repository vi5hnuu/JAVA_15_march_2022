package com.company;

public class Vehicle {
    private int currentVelocity;
    private int currentDirection;
    private String name;
    private String size;

    Vehicle(String name,String size){
        System.out.println("Vechicle ctor");
        this.currentVelocity=0;
        this.currentDirection=0;
        this.name=name;
        this.size=size;
    }

    public int getCurrentVelocity(){
        return currentVelocity;
    }
    public int getCurrentDirection(){
        return currentDirection;
    }
    public String getName(){
        return name;
    }
    public String getSize(){
        return size;
    }
    public void steer(int direction){
        this.currentDirection+=direction;
        System.out.println("Vehicle.seer() :Steering at "+currentDirection+ "degrees");
    }
    public  void move(int velocity,int direction){
        currentVelocity=velocity;
        currentDirection=direction;
        System.out.println("Vehicle.move() :Moving at "+currentVelocity+ " in the direction "+direction+" degrees");
    }
    public void stop(){
        this.currentVelocity=0;
    }
}
