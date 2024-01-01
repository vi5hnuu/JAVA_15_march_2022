package com.example._static;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre_copyCheck {
    private final String theatreName;
    public List<Seat> seats=new ArrayList<>();

    public Theatre_copyCheck(String theatreName, int numRows, int seatsPerRow){
        this.theatreName=theatreName;
        int lastRow='A'+(numRows-1);
        for(char row='A';row<=lastRow;row++){
            for(int seatNum=1;seatNum<=seatsPerRow;seatNum++){
                Seat seat=new Seat(row+String.format("%02d",seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName(){
        return theatreName;
    }


    public boolean reserveSeat(String seatNumber){ //after implementing comparable on Seat class
        Seat requesSeat=new Seat(seatNumber);
        int foundSeat=Collections.binarySearch(seats,requesSeat,null);
        if(foundSeat>=0)
            return seats.get(foundSeat).reserve();
        else{
            System.out.println("No seat "+seatNumber);
            return false;
        }
    }

    public void getSeats(){
        int i=0;
        String s="";
        for(Seat seat:seats){
            if(seat.isReserved())
                s="*";
            else
                s="";
            System.out.print(seat.getSeatNumber()+s+" ");
            i++;
            if(i%10==0)
                System.out.println();
        }
    }


    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved;

        private Seat(String seatNumber){
            reserved=false;
            this.seatNumber=seatNumber;
        }

        @Override
        public String toString(){
            return seatNumber;
        }
        @Override
        public int compareTo(Seat seat){
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve(){
            if(!isReserved()){
                this.reserved=true;
                System.out.println("\nSeat "+seatNumber+" reserved");
                return true;
            }else{
                return false;
            }
        }

        private boolean isReserved(){
            if(this.reserved)
                return true;
            else return false;
        }

        private boolean cancel(){
            if(this.reserved){
                this.reserved=false;
                System.out.println("Reservation of seat "+seatNumber+" is cancelled");
                return true;
            }else
                return false;
        }

        public String getSeatNumber(){
            return seatNumber;
        }
    }
}












