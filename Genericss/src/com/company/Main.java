package com.company;

import javax.crypto.interfaces.PBEKey;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
////        ArrayList items=new ArrayList();//both same
//        ArrayList<Integer> items=new ArrayList<>();
////        items.add("Vishnu");
//        items.add(12);
////        items.add(12.55);
//
//        System.out.println(items.get(0));//at runtime toString of string class
////        System.out.println(items.get(1));//at runtime toString of Integer class
////        System.out.println(items.get(2));//at runtime toString of Double class
//
//
////        System.out.println(((String)(items.get(0))).toUpperCase());
////        System.out.println(((Integer)(items.get(1)))*10);
////        System.out.println(((int)(items.get(1)))*10);//(int)(Integer)==(Integer) in print statements ..unboxing //but (double)(Integer) is error
//////        System.out.println(items.get(1)*10); //object cannot be multiplied
////        System.out.println(items.get(2));


        //////////////////////////
        FootballPlayer joe=new FootballPlayer("Joe");
        BaseBallPlayer pat=new BaseBallPlayer("Pat");
        SoccerPlayer bekham=new SoccerPlayer("Beckham");

//        Team ACrows=new Team("A crows");
//        ACrows.addplayer(new String("ok")); //E extends Player || <E>==<E extends Object>
//        ACrows.addplayer(new PLayer("ok"));

        Team<BaseBallPlayer> ACrows=new Team<>("A crows");
//        Team<SoccerPlayer> BCrows=new Team<>("B crows");
//        Team<FootballPlayer> CCrows=new Team<>("C crows");
        ACrows.addplayer(pat);
//        BCrows.addplayer(bekham);
//        CCrows.addplayer(joe);
//
//
//        ACrows.numPlayers();
//        BCrows.numPlayers();
//        CCrows.numPlayers();

        Team<SoccerPlayer> brokenTeam=new Team<>("Thiswon't work");
        brokenTeam.addplayer(bekham);

        Team<FootballPlayer> melbourne=new Team<>("Melbourne");
        FootballPlayer banks=new FootballPlayer("Gordan");
        melbourne.addplayer(banks);

        Team<FootballPlayer> hawthorn=new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle=new Team<>("Fremantle");

//        hawthorn.matchResult(fremantle,1,0);
//        hawthorn.matchResult(ACrows,3,8);
//        ACrows.matchResult(fremantle,2,1);
//        ACrows.matchResult(melbourne,8,8);

        //after making matchresult(Team<T>
        hawthorn.matchResult(fremantle,1,0);

        //these cannot be compared
//        hawthorn.matchResult(ACrows,3,8);// as this==hawthorm type and opponednt is Acrows same reson for below
//        ACrows.matchResult(fremantle,2,1);
//        ACrows.matchResult(melbourne,8,8);

        System.out.println("Rankings");
        System.out.println(hawthorn.getName()+" : "+hawthorn.ranking());
        System.out.println(fremantle.getName()+" : "+fremantle.ranking());
        System.out.println(hawthorn.compareTo(fremantle));
    }
}
