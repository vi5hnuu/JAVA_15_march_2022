package com.company;

public class OverridingAnamolies {
    public static void main(String[] args) {
    B b=new B();
    b.printMe(5);
    b.printMe(true);
    b.printMe(5,true);
    }

}


class A {
    public void printMe(int number) { // statement 1
        System.out.println(number);
    }
    public void printMe(boolean flag) { // statement 2
        System.out.println(flag);
    }
    public void printMe(int number, boolean flag) { // statement 3
        System.out.println(number + " : " + flag);
    }
}
class B extends A {
    public void printMe(int number) { // statement 4
        System.out.println("The double of " + number + " is : " + (number * 2));
    }
}


//only one methos is ovridden in class B rest is intact and doesnt become hidden..