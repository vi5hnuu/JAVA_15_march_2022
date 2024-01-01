package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Car {
////public int a=10;
//int a=10;  //by default public
////////////////////////////
    private  int doors;
    private int wheels;
    private  String model;
    private  String engine;
    private  String color;
    public void printIt(){ //not static
        System.out.println("doors = "+doors+" "+this.doors);
        System.out.println("wheels = "+wheels+" "+this.wheels);
        System.out.println("models = "+model+" "+this.model);
        System.out.println("engine = "+engine+" "+this.engine);
        System.out.println("color = "+color+" "+this.color);
    }
    public void getData(){ //not static
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter no of Doors :");
        doors=scn.nextInt();
        scn.nextLine();
        System.out.print("Enter no of Wheels :");
        wheels=scn.nextInt();
        scn.nextLine();
        System.out.print("Enter model :");
        String modell=scn.nextLine();

        String validModel=modell.toLowerCase();
        if(validModel.equals("proche") || validModel.equals("holens"))
            this.model=modell;
        else
            this.model="Invalid";
        System.out.print("Enter engine:");
        engine=scn.nextLine();
        System.out.print("Enter color :");
        color=scn.nextLine();
        scn.close();
    }
}
