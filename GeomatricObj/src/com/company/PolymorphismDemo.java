package com.company;

public class PolymorphismDemo {
    public static void main(String[] args){
    displayObject(new Circle(1,"red",false));
    displayObject(new Rectangle(1,1,"black",true));

    //////////////////////////
        Object o = new GeomatricObject();
        System.out.println(o.toString());
        System.out.println(o);
    }

    public static void displayObject(GeomatricObject object){
        System.out.println("created on "+object.getDateCreated()+" color is "+
                object.getColor());

    }
}
