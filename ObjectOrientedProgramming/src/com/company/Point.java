package com.company;

public class Point {
    private int x,y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public Point(){
        this(0,0);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public double distance(){
        return Math.sqrt(Math.pow((0-x)*1.0,2)+Math.pow((0-y)*1.0,2));
    }
    public double distance(int x,int y){
        return Math.sqrt(Math.pow((this.x-x)*1.0,2)+Math.pow((this.y-y)*1.0,2));
    }
    public double distance(Point obj){
        return Math.sqrt(Math.pow((this.x-obj.x)*1.0,2)+Math.pow((this.y-obj.y)*1.0,2));
    }

}
