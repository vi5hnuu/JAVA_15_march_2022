package com.company;

public class TestDeomatricObject {
    public static void main(String[] args){
        GeomatricObjects geoObject1=new Circle(5);
        GeomatricObjects geoObject2=new Rectangle(5,3);
        System.out.println("The two Objects have same area :"+equalArea(geoObject1,geoObject2));

        displayGeomatricObject(geoObject1);
        displayGeomatricObject(geoObject2);
    }
    public static boolean equalArea(GeomatricObjects ob1,GeomatricObjects ob2){
        return ob1.getArea()==ob2.getArea();
    }
    public static void displayGeomatricObject(GeomatricObjects ob){
        System.out.println();
        System.out.println("The area is "+ob.getArea());
        System.out.println("The perimeter is "+ob.getPerimeter());
        //we dont need to typecase to use methods getarea and getprimeter
        //as they are methods of Geomatric objects and can be referenced at compile time
        //and at run time overridden methods are referrenced

        //when Geomatric is not abstract class the methods area and perimeter were in respective classes
        //so we have to typecase as at compile time Geomatric object do not have those area and perimeter method

    }
}
