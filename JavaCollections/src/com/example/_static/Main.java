package com.example._static;

public class Main {

    public static void main(String[] args) {
        Theatre theatre=new Theatre("Olympian",8,12);
        theatre.getSeats();
        if(theatre.reserveSeat("H11"))
            System.out.println("please Pay");
        else
            System.out.println("Sorry is already taken");
        theatre.getSeats();

    }
}
