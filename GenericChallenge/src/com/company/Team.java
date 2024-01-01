//package com.company;
//
//import java.util.ArrayList;
//
//public class Team<T> { //but T can be anyting like Integer,String ? what would u do now and also those worst casting down in  methods
//    private String name;
//    int played=0;
//    int won=0;
//    int lost=0;
//    int ties=0;
//
//    private ArrayList<T> memeber=new ArrayList<>();
//
//    public Team(String name){
//        this.name=name;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public boolean addplayer(T pLayer){//T is know when variable is created(Runtime)
//        if(memeber.contains(pLayer)){
////            System.out.println(pLayer.getName()+" is already in this team");//at compile time we dont know what is Player as it of type T
//            System.out.println(((PLayer)pLayer).getName()+" is already in this team");//temporary fix
//            return false;
//        }
//        else{
//            memeber.add(pLayer);
////            System.out.println(pLayer.getName()+" added to the team");
//            System.out.println(((PLayer)pLayer).getName()+" added to the team");//temporary fix
//            return true;
//        }
//    }
//
//    public int numPlayers(){
//        return this.memeber.size();
//    }
//
//    public void matchResult(Team opponent,int ourScore,int theirScore){
//        if(ourScore>theirScore)
//            won++;
//        else if(ourScore==theirScore)
//            ties++;
//        else
//            lost++;
//
//        played++;
//        if(opponent!=null){
//            opponent.matchResult(null,theirScore,ourScore);
//        }
//    }
//
//    public int ranking(){
//        return (won*2)+ties;
//    }
//}


//////////////////////////////////////////
//////////////////////////////////////////
package com.company;

import java.util.ArrayList;

public class Team<T extends PLayer>  implements Comparable<Team<T>>{ //for multiple .. T extends class & interface & interface ... first is always class or u get a compiler eror
    //only one class can be used u know why ?
    //interface can be any number
    private String name;
    int played=0;
    int won=0;
    int lost=0;
    int ties=0;

    private ArrayList<T> memeber=new ArrayList<>();

    public Team(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public boolean addplayer(T pLayer){//T is know when variable is created(Runtime)
        if(memeber.contains(pLayer)){
            System.out.println(pLayer.getName()+" is already in this team");//at compile time Player method are seen, at runtime when obj is created
            //those methods are binds to actual object
            return false;
        }
        else{
            memeber.add(pLayer);
            System.out.println(pLayer.getName()+" added to the team");
            return true;
        }
    }

    public int numPlayers(){
        int numPlayers=this.memeber.size();
        System.out.println(numPlayers+" players in "+this.name);
        return this.memeber.size();
    }

    public void matchResult(Team<T> opponent,int ourScore,int theirScore){
        if(ourScore>theirScore)
            won++;
        else if(ourScore==theirScore)
            ties++;
        else
            lost++;

        played++;
        System.out.println(this.name+" Won " +this.won+" lost "+this.lost+" ties "+this.ties);
        if(opponent!=null){
            opponent.matchResult(null,theirScore,ourScore);
        }
        if(opponent==null)
        System.out.println("===Result===");
    }

    public int ranking(){
        return (won*2)+ties;
    }


    @Override
    public int compareTo(Team<T> opponent){
        if(this.ranking()>opponent.ranking())
            return -1;
        else if(this.ranking()<opponent.ranking())
            return 1;
        else
            return 0;
    }
}
