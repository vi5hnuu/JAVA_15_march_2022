package com.company;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private  int size;
    private int weight;

    public Animal(String name,int brain,int body,int size,int weight){
        System.out.println("Animal class");
        this.name=name;
        this.brain=brain;
        this.body=body;
        this.size=size;
        this.weight=weight;
    }
    public void eat(){
        System.out.println("Animal.eat() called.");
    }
    public void move(int speed){
        System.out.println("Animal.move() called.\nSpeed "+speed);
    }

    public String getName(){
        return this.name;
    }
    public int getBrain(){
        return this.brain;
    }
    public int getBody(){
        return this.body;
    }
    public int getSize(){
        return this.size;
    }
    public int getWeight(){
        return this.weight;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setBrain(int brain){
        this.brain=brain;
    }
    public void setBody(int body){
        this.body=body;
    }
    public void setSize(int size){
        this.size=size;
    }
}
