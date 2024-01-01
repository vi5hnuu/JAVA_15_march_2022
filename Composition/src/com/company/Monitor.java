package com.company;

//monitor has resulation
public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resulation natioResulation;
    public Monitor(String model,String manufacturer,int size,Resulation nativeResulation){
        this.model=model;
        this.manufacturer=manufacturer;
        this.size=size;
        this.natioResulation=nativeResulation;
    }
    public void drawpixelAt(int x,int y,String color){
        System.out.println("Drawing picture at x "+x+" y "+y+" color "+color);;
    }
}
