package com.company;

public  class Rectangle extends GeomatricObjects {
    private double width;
    private double height;

    public Rectangle(){}
    public Rectangle(double width,double height){
        this.height=height;
        this.width=width;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    @Override
    public double getArea(){
        return height*width;
    }
    @Override //try not overiding one of the method
    public double getPerimeter() {
        return 2 * (width + height);
    }
    /*
    * In c++ if we do not override the pure virtual methods in subclass the subclass will become the abstract
    * In java it gives error and its obvios as we know that abstract methods inc++ and java are just declaration so we must ovrride them in subclass for meaning.
    * */
}
