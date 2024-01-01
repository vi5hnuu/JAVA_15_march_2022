package com.company;


//parent class
public  class Overringvshiding
{
    public static void method1()
    {
        System.out.println("Method-1 of the Demo class is executed.");
    }
    public void method2()
    {
        System.out.println("Method-2 of the Demo class is executed.");
    }
}
//child class
class Sample extends Overringvshiding{
    public static void method1()
    {
        System.out.println("Method-1 of the Sample class is executed.");
    }
    public void method2()
    {
        System.out.println("Method-2 of the Sample class is executed.");
    }
    public static void main(String args[])
    {
        Overringvshiding d1 = new Overringvshiding();
//d2 is reference variable of class Demo that points to object of class Sample
        Overringvshiding d2 = new Sample();
//method calling with reference (method hiding)
        d1.method1();
        d2.method1();
//method calling with object (method overriding)
        d1.method2();
        d2.method2();
    }
}//if a class contain psvm method then defin it in seperate class or it cannot be defined public