package com.company;

public class TestPrinter {
    public static void main(String[] args){
        Printer printer=new Printer(50,false);
        System.out.println("Initial page count "+printer.getPagesPrinted());
        int pagesPrinted=printer.printPages(5);
        System.out.println("Pages printed was "+pagesPrinted);
        System.out.println("Pages printed so far by printer "+printer.getPagesPrinted());
    }
}
