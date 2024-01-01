package com.company;

public class TestCircleWithCustomException {
    public static void main(String[] args){
        try{
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);
        }
        catch (InvalidRadiusExfeptionClass ex){
            System.out.println(ex);
        }
        System.out.println("Number of object created :"+CircleWithCustomException.getNumberOfObjects());
    }
}


class CircleWithCustomException{
    private double radius;
    private static  int numberOfObjects=0;
    public CircleWithCustomException() throws InvalidRadiusExfeptionClass{
        this(1.0);
    }
    public CircleWithCustomException(double radius) throws InvalidRadiusExfeptionClass{
        setRadius(radius);
        numberOfObjects++;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius) throws InvalidRadiusExfeptionClass{
        if(radius>=0)
            this.radius=radius;
        else
            throw new InvalidRadiusExfeptionClass(radius);
    }
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    public double findArea(){
        return radius*radius*Math.PI;
    }
}
