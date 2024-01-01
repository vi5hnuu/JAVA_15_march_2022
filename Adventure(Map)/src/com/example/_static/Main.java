package com.example._static;

import java.util.HashMap;
import java.util.*;

public class Main {
    private static Map<Integer,Location> location=new HashMap<>();
    public static void main(String[] args) {
        //Location

        Scanner input=new Scanner(System.in);
        location.put(1,new Location(0,"You are sitting in from of a computer learning java"));
        location.put(2,new Location(1,"you are standing at the end of a road before a small shop"));
        location.put(3,new Location(2,"you are at the top of hill"));
        location.put(4,new Location(3,"you are indese a buidling , a well hose for a small spring"));
        location.put(5,new Location(4,"your are in avalley beside a stream"));
        location.put(6,new Location(5,"you are in the forest"));

        location.get(1).addExit("W",2);
        location.get(1).addExit("E",3);
        location.get(1).addExit("S",4);
        location.get(1).addExit("N",5);
//        location.get(1).addExit("Q",0);

        location.get(2).addExit("N",5);
//        location.get(2).addExit("Q",0);

        location.get(3).addExit("W",1);
//        location.get(3).addExit("Q",0);

        location.get(4).addExit("N",1);
        location.get(4).addExit("W",2);
//        location.get(4).addExit("Q",0);


        location.get(5).addExit("S",1);
        location.get(5).addExit("W",2);
//        location.get(5).addExit("Q",0);

        Map<String,String> vocabulary=new HashMap<>();
        vocabulary.put("QUIT","Q");
        vocabulary.put("NORTH","N");
        vocabulary.put("SOUTH","S");
        vocabulary.put("WEST","W");
        vocabulary.put("EAST","E");


        int loc=1;
        while (true){
            System.out.println(location.get(loc).getDescription());
            if(loc==0)
                break;
            Map<String,Integer> exists=location.get(loc).getExists();
            System.out.println("Avalable exits are ");
            for(String exit: exists.keySet())
                System.out.print(exit+", ");
            System.out.println();

            String direction=input.nextLine().toUpperCase();
            if(direction.length()>1){
                String[] words=direction.split(" ");
                for(String word:words){
                    if(vocabulary.containsKey(word.toUpperCase())){
                        direction=vocabulary.get(word.toUpperCase());
                    break;
                    }
                }
            }
            if(direction.equalsIgnoreCase("Q"))
                break;
            if(exists.containsKey(direction)){
                loc=exists.get(direction);
            }
            else{
                System.out.println("you cannot go in that direction");
            }
        }


//        String[] road="You are standing at the end of a road befoer a small brick building".split(" ");
//        for(String i:road)
//            System.out.println(i);
//
//        System.out.println("=====================");
//        String[] building="You are indide a building, awell house for a small,spring".split(", ");
//        for(String i:building)
//            System.out.println(i);
//        System.out.println("=========================");


    }
}
