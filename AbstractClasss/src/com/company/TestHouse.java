package com.company;

public class TestHouse {
    public static void main(String[] args){
        House house1 = new House(1, 1750.50);
        House house2 = (House)house1.clone();//typecase as return object is of type Object
        System.out.println(house1==house2);
        System.out.println(house1.compareTo(house2));
    }
}
