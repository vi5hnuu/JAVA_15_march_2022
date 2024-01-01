package com.company;

public class AnonymousClass {
}

interface Printer { //this is a top-level interface
    public void printMe();
}

class x{  //this is a normal top-level class
    public static void main(String[] args) {
        class PrinterImpl implements Printer { // an example of a normal local class
            public void printMe() {
                System.out.println("printerimpl");
            }
        }

        Printer myPrinter1 = new PrinterImpl();

        Printer myPrinter2 = new Printer() {// an example of an anonymous class //implements Printer
            public void printMe() {
                System.out.println("Anonymous");
            }
        };


        myPrinter1.printMe();
        myPrinter2.printMe();
    }
}
