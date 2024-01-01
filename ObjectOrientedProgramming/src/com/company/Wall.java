package com.company;

public class Wall {
    private double height;
    private double width;

    public Wall(double width,double height){
        if(height<0 && width<0)
            this.height=this.width=0;
        else if(width<0 && height>=0){
            this.width=0;
            this.height=height;
        }
        else if(height<0 && width>=0){
            this.width=width;
            this.height=0;
        }
        else{
            this.height=height;
            this.width=width;
        }
    }
    public Wall(){
        this(0.0,0.0);
    }

    public double getHeight(){
        return this.height;
    }
    public double getWidth(){
        return this.width;
    }
    public void setHeight(double height){
        if(height>=0)
            this.height=height;
        else
            this.height=0;
    }
    public void setWidth(double width){
        if(width>=0)
            this.width=width;
        else
            this.width=0;
    }
    public double getArea(){
        return this.height*this.width;
    }
}
