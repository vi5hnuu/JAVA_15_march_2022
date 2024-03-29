package com.example._static;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_comparablevsComparator {

    public static void main(String[] args) {
        Theatre_cvsc theatre=new Theatre_cvsc("Olympian",8,12);
        if(theatre.reserveSeat("D12"))
            System.out.println("Please pay for D12");
        else
            System.out.println("Seat already reserved");

        if(theatre.reserveSeat("D12"))
            System.out.println("Please pay for D12");
        else
            System.out.println("Seat already reserved");


        if(theatre.reserveSeat("B13"))
            System.out.println("Please pay for B13");
        else
            System.out.println("Seat already reserved");


        List<Theatre_cvsc.Seat> reverseSeat=new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeat);
        printList(reverseSeat);

        List<Theatre_cvsc.Seat> priceSeats=new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00",13.00));
        priceSeats.add(theatre.new Seat("A00",13.00));
        Collections.sort(priceSeats,Theatre_cvsc.PRICE_ORDER);
        printList(priceSeats);
    }
    public static void printList(List<Theatre_cvsc.Seat> list){
        for(Theatre_cvsc.Seat seat:list)
            System.out.print(" "+seat.getSeatNumber()+" "+seat.getPrice());

        System.out.println();
        System.out.println("============================");

    }
}
