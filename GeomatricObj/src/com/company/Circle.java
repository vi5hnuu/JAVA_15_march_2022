package com.company;

public class Circle extends GeomatricObject {
    private double radius;

    public Circle(){} //radius=0 by default

    public Circle(double radius){
        this.radius=radius;
    }
    public  Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }
    public  void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public void printCircle(){
        System.out.println("This circle is created "+getDateCreated()+
                " and the radius is "+radius);
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Circle) {
            return radius == ((Circle) o).radius;
        }
            else
                return false;

    }
}
