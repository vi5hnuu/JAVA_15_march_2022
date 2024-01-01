package com.company;

public class DeluxeBurger extends HamBurger{

    public DeluxeBurger() {
        super("Deluxe","Sausage & Bacon", 19.10,"White");
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drink",1.81);
    }
    @Override
    public void addHamburgerAddition1(String name,double price){
        System.out.println("Cannot not add additional items to a delux burger");
    }
    @Override
    public void addHamburgerAddition2(String name,double price){
        addHamburgerAddition1("",0);
    }
    @Override
    public void addHamburgerAddition3(String name,double price){
        addHamburgerAddition1("",0);
    }
    @Override
    public void addHamburgerAddition4(String name,double price){
        addHamburgerAddition1("",0);
    }

}
