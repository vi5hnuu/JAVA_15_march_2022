package com.company;

public class Ceiling {
    private  int height;
    private int paintedCoor;

    public Ceiling(int height,int paintedCoor){
        this.height=height;
        this.paintedCoor=paintedCoor;
    }

    public int getHeight(){
        return height;
    }
    public int getPaintedCoor(){
        return paintedCoor;
    }
}
