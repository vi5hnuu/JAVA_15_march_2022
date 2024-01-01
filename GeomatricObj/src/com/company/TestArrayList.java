package com.company;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args){
        ArrayList<String> cityList=new ArrayList<>();
        cityList.add("Londan");
        cityList.add("Denver");
        cityList.add("paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");
        System.out.println("List Size :"+cityList.size());
        System.out.println("Is miami in the list :"+cityList.contains("Miami"));
        System.out.println("The location of denver in the list :"+cityList.indexOf("Denver"));
        System.out.println("Is the list empty "+cityList.isEmpty());

        cityList.add(2,"Xian");
        cityList.remove("Miami");
        cityList.remove(1);
        System.out.println(cityList.toString());
        for(int i=cityList.size()-1;i>=0;i--)
            System.out.print(cityList.get(i)+" ");
        System.out.println();

        ArrayList<Circle> list=new ArrayList<>();
        list.add(new Circle(2));
        list.add(new Circle(3));
        System.out.println("The area of the circle "+list.get(0).getArea());

    }
}
