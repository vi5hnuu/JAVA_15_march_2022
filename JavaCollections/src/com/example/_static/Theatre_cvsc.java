package com.example._static;

import java.util.*;

public class Theatre_cvsc {
    private final String theatreName;
    private List<Seat> seats=new ArrayList<>();
//    static final Comparator<Seat> PRICE_ORDER=new Comparator<Seat>() {
//        @Override
//        public int compare(Seat seat1, Seat seat2) {
//            if(seat1.getPrice()<seat2.getPrice())
//                return -1;
//            else if(seat1.getPrice()>seat2.getPrice())
//                return 1;
//            else
//                return 0;
//        }
//    };


    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER=new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if(seat1.getPrice()<seat2.getPrice())
                return -1;
            else if(seat1.getPrice()>seat2.getPrice())
                return 1;
            else
                return 0;
        }
    };
    }
    public Theatre_cvsc(String theatreName, int numRows, int seatsPerRow){
        this.theatreName=theatreName;
        int lastRow='A'+(numRows-1);
        for(char row='A';row<=lastRow;row++){
            for(int seatNum=1;seatNum<=seatsPerRow;seatNum++){
                double price=12.00;
                if((row<'D') && (seatNum>=4 && seatNum<=9))
                    price=14.00;
                else if(row>'F' || (seatNum<4 || seatNum>9))
                    price=7.00;
                Seat seat=new Seat(row+String.format("%02d",seatNum),price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName(){
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){ //after implementing comparable on Seat class
        Seat requesSeat=new Seat(seatNumber,0);
       int foundSeat=Collections.binarySearch(seats,requesSeat,null);
        if(foundSeat>=0)
            return seats.get(foundSeat).reserve();
        else{
            System.out.println("No seat "+seatNumber);
            return false;
        }
    }

    public Collection<Seat> getSeats(){
        return seats;
    }

    ///////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public class Seat implements Comparable<Seat>{
        private double price;
        private final String seatNumber;
        private boolean reserved;

        public Seat(String seatNumber,double price){
            this.price=price;
            reserved=false;
            this.seatNumber=seatNumber;
        }

        @Override
        public int compareTo(Seat seat){
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }



        private boolean reserve(){
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

        public double getPrice(){
            return price;
        }
    }
}












