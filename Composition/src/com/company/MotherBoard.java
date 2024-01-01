package com.company;


//inheritanc is a relationship
//compostion has a relationship
//eg a car is vehicle
//but a computer has a motherboard and not computer inherit motherboard
public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model,String manufacturer,int ramSlots,int cardSlots,String bios){
        this.model=model;
        this.manufacturer=manufacturer;
        this.ramSlots=ramSlots;
        this.cardSlots=cardSlots;
        this.bios=bios;
    }
    public void loadProgramm(String programName){
        System.out.println("programm "+programName+" is now loading...");
    }
    public String getModel(){
        return model;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getBios(){
        return bios;
    }
    public int getRamSlots(){
        return ramSlots;
    }
    public int getCardSlots(){
        return cardSlots;
    }
}
