package com.company;

public class InvalidRadiusExfeptionClass extends Exception {
    private double radius;

    public  InvalidRadiusExfeptionClass(double radius){
        super("Invalid radius "+radius);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
}
