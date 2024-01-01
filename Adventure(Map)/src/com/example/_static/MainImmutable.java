package com.example._static;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainImmutable {
    private static Map<Integer,LocationImmutable> location=new HashMap<>();
    public static void main(String[] args) {
        //Location

        Scanner input=new Scanner(System.in);

        Map<String,Integer> tempExit=new HashMap<>();
        location.put(0,new LocationImmutable(0,"You are sitting in from of a computer learning java",tempExit));
        tempExit=new HashMap<>();
        tempExit.put("W",2);
        tempExit.put("E",3);
        tempExit.put("S",4);
        tempExit.put("N",5);
        location.put(1,new LocationImmutable(1,"you are standing at the end of a road before a small shop",tempExit));

        tempExit=new HashMap<>();
        tempExit.put("N",5);
        location.put(2,new LocationImmutable(2,"you are at the top of hill",tempExit));

        tempExit=new HashMap<>();
        tempExit.put("W",1);
        location.put(3,new LocationImmutable(3,"you are indese a buidling , a well hose for a small spring",tempExit));

        tempExit=new HashMap<>();
        tempExit.put("N",1);
        tempExit.put("W",2);
//        location.put(4,new LocationImmutable(4,"your are in avalley beside a stream",tempExit));
        location.put(4,new LocationImmutable(4,"your are in avalley beside a stream",null));//ctor crash

        tempExit=new HashMap<>();
        tempExit.put("S",1);
        tempExit.put("W",2);
        location.put(5,new LocationImmutable(5,"you are in the forest",tempExit));

        Map<String,String> vocabulary=new HashMap<>();
        vocabulary.put("QUIT","Q");
        vocabulary.put("NORTH","N");
        vocabulary.put("SOUTH","S");
        vocabulary.put("WEST","W");
        vocabulary.put("EAST","E");



//        tempExit.remove("S");//use of line 15 in LocationImmutable..
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
