package com.company;

public class ComparabelRectangle extends Rectangle implements Comparable<ComparabelRectangle>{
    public ComparabelRectangle(double width,double height){
        super(width,height);
    }
    @Override
    public int compareTo(ComparabelRectangle o){
        if(getArea()>o.getArea())
            return 1;
        else if(getArea()<o.getArea())
            return -1;
        else
            return 0;
    }
    @Override
    public String toString(){
        return "Width:"+getWidth()+" Height: "+getHeight()+" Area: "+getArea();
    }
}
