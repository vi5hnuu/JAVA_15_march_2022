package com.company;

public class Circle {
    private double radius;

    public Circle(){
        System.out.println("zero arg Ctor called");
        this.radius=1.0;
    }
    public Circle(double radius){
        System.out.println("One arg Ctor called");
        this.radius=radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

}
