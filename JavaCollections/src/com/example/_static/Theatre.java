package com.example._static;

import java.util.*;

public class Theatre {
    private final String theatreName;
//    private Collection<Seat> seats=new LinkedHashSet<>();
    private List<Seat> seats=new ArrayList<>();

    public Theatre(String theatreName,int numRows,int seatsPerRow){
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

//    public boolean reserveSeat(String seatNumber){
//        Seat requesSeat=null;
//        int count=0;
//        for(Seat seat:seats){
//            count++;
//            if(seat.getSeatNumber().equals(seatNumber)){
//                requesSeat=seat;
//                break;
//            }
//        }
//        System.out.println("\nExecuted "+count+" times");
//
//        if(requesSeat==null){
//            System.out.println("there is no seat "+seatNumber);
//            return false;
//        }
//        return requesSeat.reserve();
//    }


    public boolean reserveSeat(String seatNumber){ //after implementing comparable on Seat class
        Seat requesSeat=new Seat(seatNumber);
        //we use binary search ass out data is already sorted.....

        //java code copied
//        public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
//            if (c==null)
//                return binarySearch((List<? extends Comparable<? super T>>) list, key);
//
//            if (list instanceof RandomAccess || list.size()<BINARYSEARCH_THRESHOLD)
//                return Collections.indexedBinarySearch(list, key, c);
//            else
//                return Collections.iteratorBinarySearch(list, key, c);
//        }


//        int indexedBinarySearch(List<? extends Comparable<? super T>> list, T key) {
//            int low = 0;
//            int high = list.size()-1;
//
//            while (low <= high) {
//                int mid = (low + high) >>> 1; //divide by 2
//                Comparable<? super T> midVal = list.get(mid);
//                int cmp = midVal.compareTo(key);
//
//                if (cmp < 0)
//                    low = mid + 1;
//                else if (cmp > 0)
//                    high = mid - 1;
//                else
//                    return mid; // key found
//            }
//            return -(low + 1);  // key not found
//        }
        //
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

//    private class Seat{
//        private final String seatNumber;
//        private boolean reserved;
//
//        private Seat(String seatNumber){
//            reserved=false;
//            this.seatNumber=seatNumber;
//        }
//
//        private boolean reserve(){
//            if(!isReserved()){
//                this.reserved=true;
//                System.out.println("\nSeat "+seatNumber+" reserved");
//                return true;
//            }else{
//                return false;
//            }
//        }
//
//        private boolean isReserved(){
//            if(this.reserved)
//                return true;
//            else return false;
//        }
//
//        private boolean cancel(){
//            if(this.reserved){
//                this.reserved=false;
//                System.out.println("Reservation of seat "+seatNumber+" is cancelled");
//                return true;
//            }else
//                return false;
//        }
//
//        private String getSeatNumber(){
//            return seatNumber;
//        }
//    }

    private class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved;

        private Seat(String seatNumber){
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

        private String getSeatNumber(){
            return seatNumber;
        }
    }
}












