package com.example._static;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MaincopyCheck {

    public static void main(String[] args) {
        Theatre_copyCheck theatre=new Theatre_copyCheck("Olympian",8,12);
        List<Theatre_copyCheck.Seat> seat_copy=new ArrayList<>(theatre.seats);//make seat_copy by elements of theatre.seats but elements are references so it is actually a shallow copy
        printList(seat_copy);
        seat_copy.get(1).reserve();
        theatre.getSeats();//second obj is reserved

        //override clone method of obj in Seat class and make it public
        System.out.println();
//        Collections.reverse(seat_copy);
        Collections.shuffle(seat_copy);
        printList(seat_copy);//reversed or shuffled
        theatre.getSeats();//not reversed or not shuffled do you know why.. ?

        System.out.println();
        Theatre_copyCheck.Seat minSeat=Collections.min(seat_copy);
        Theatre_copyCheck.Seat maxSeat=Collections.max(seat_copy);
        System.out.println("Min seat "+minSeat);
        System.out.println("Max seat "+maxSeat);

        System.out.println("=========================");
        sortList(seat_copy);//line 19 shuuffled
        printList(seat_copy);
    }

    public static void printList(List<Theatre_copyCheck.Seat> list){
        for(Theatre_copyCheck.Seat seat:list)
            System.out.print(" "+seat.getSeatNumber());

        System.out.println();
        System.out.println("============================");

    }

    public static void sortList(List<? extends Theatre_copyCheck.Seat> list){ //1.
//    public static void sortList(List<? extends Comparable<Theatre_copyCheck.Seat>> list){ //2.
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).compareTo(list.get(j))>0){ //for 2. list.get() is error as comaparewable do nnot have get method at compile time
                    Collections.swap(list,i,j); //swap references
                }
            }
        }
    }







}
