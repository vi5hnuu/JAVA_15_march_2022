package com.company;

public interface ITelephone { //public is redundant everywhere(bydefault public)
    public void powerOn();
    public void dial(int phoneNumer); //public(Modifiers) is redundant in interface
//    default void where(){ //can be overridden
//        System.out.println("In ITelephone interface");
//    }
    default public void where(){ //can be overridden
        System.out.println("In ITelephone interface");
    }
    public void answer();
    boolean callPhone(int phoneNumber);

    boolean isRinging();
//private method should have a body and they are only visibke in iterface...
// protect has no meaning..

//In general, the protected members can be accessed in the same class or, the class inheriting it.
//But, we do not inherit an interface we will implement it. Therefore, the members of an interface cannot be protected.
}


//What are static methods in interfaces?#
//The static methods in interfaces are similar to default methods but the only
// difference is that you can’t override them. Now, why do we need static methods in interfaces
// if we already have default methods?
//
//Suppose you want to provide some implementation in your interface and
// you don’t want this implementation to be overridden in the implementing class, then you
// can declare the method as static.
