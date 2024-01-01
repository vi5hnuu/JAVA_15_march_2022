package com.company;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague=new League<>("AFL");
        Team<FootballPlayer> adelaideCrows=new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne=new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn=new Team<>("Hawthorn");
        Team<FootballPlayer> frentle=new Team<>("frentle");

        Team<BaseBallPlayer> baseBallPlayerTeam=new Team<>("Chicago cubs");
        hawthorn.matchResult(frentle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);
        adelaideCrows.matchResult(hawthorn,2,1);

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(frentle);

        footballLeague.showLeagueTable();

    }
}
