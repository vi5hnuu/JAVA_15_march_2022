package com.company;

//No, the Methods that are declared as final cannot be Overridden or hidden.
//No, the Methods that are declared as static cannot be Overridden but can be written as it is but it will hide the super class static method (hidden).

//Static methods cannot be overridden because method overriding only occurs in the context of dynamic (i.e. runtime) lookup of methods.
// Static methods (by their name) are looked up statically (i.e. at compile-time). (in c++ also)

//Can a static method be overridden in Java, or can you override and overload static method in Java, is a common Java
// interview questions mostly asked to 2 years experienced Java programmers. The answer is, No, you can not override
// static method in Java, though you can declare a method with the same signature in a subclass. It won't be overridden
// in the exact sense, instead, that is called method hiding. But at the same time, you can overload static methods in Java,
// there is nothing wrong with declaring static methods with the same name, but different arguments. Some time interviewer
// also ask, Why you can not override static methods in Java? The answer to this question lies in the time of resolution.

//As I said in the difference between static and dynamic binding, static methods are bonded during compile time using Type of
// reference variable, and not Object. If you have using IDE like Netbeans and Eclipse, and If you try to access static methods
// using an object, you will see warnings. As per Java coding convention, static methods should be accessed by class name rather than an object.
//
//In short, a static method can be overloaded, but can not be overridden in Java. If you declare,  another static method with
// same signature in derived class than the static method of superclass will be hidden, and any call to that static method in
// subclass will go to static method declared in that class itself. This is known as method hiding in Java.

//        * Java Program to show that, you can not override static method in Java.
//        * If you declare same method in subclass then, It's known as method hiding.

public class StaticMethodAnamolis {


    public static void main(String args[]) {

        Parent p = new Parent();
        p.name();   // should call static method from super class (Parent)
        // because type of reference variable
        // p is Parent

        p = new Child();
        p.name();  // as per overriding rules this should call to child's static
        // overridden method. Since static method can not be overridden
        // , it will call parent static method
        // because Type of p is Parent.

        Child c = new Child();
        c.name();  // will call child static method because static method
        // get called by type of Class

    }
}

class Parent{

    /*
     * original static method in super class which will be hidden
     * in subclass.
     */
    public static void name(){
        System.out.println("static method from Parent");
    }
}

class Child extends Parent{

    /*
     * Static method with same signature as in super class,
     * Since static method can not be overridden, this is called
     * method hiding. Now, if you call Child.name(), this method
     * will be called, also any call to name() in this particular
     * class will go to this method, because super class method is hidden.
     */
    public static void name(){
        System.out.println("static method from Child");
    }
}

//Output
//static method from Parent
//static method from Parent
//static method from Child