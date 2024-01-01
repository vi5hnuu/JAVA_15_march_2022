package com.company;

public class DynamicBinding {
    public static void main(String[] args){
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
        someMethod(new Circle());
    }
    public static void m(Object x){
        System.out.println(x.toString());
    }

    public static void someMethod(Object myObject){
        if(myObject instanceof Circle) {
            System.out.println("The circle diameter is " + ((Circle) myObject).getDiameter());
        }
    }
}

class GraduateStudent extends Student{

}

class Student extends Person{
    @Override
    public String toString(){
        return "Student";
    }
}

class Person extends Object{
    @Override
    public String toString(){
        return "person";
    }
}
