package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable{
    private  String name;
    private int hitPoints;
    private  int strength;
    private  String weapon;

    public Player(String name, int hitPoints, int strength){
        this.name=name;
        this.hitPoints=hitPoints;
        this.strength=strength;
        this.weapon="Sword";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public String toString(){
        return "Player { "+"name = "+name+'\''+", hitpoints = "+hitPoints+
                ", strength = "+strength+", weapon = "+weapon+'\''+"}";
    }

    @Override
    public List<String> write(){
        List<String> values=new ArrayList<>();
        values.add(0,this.name);
        values.add(1,String.valueOf(hitPoints));
        values.add(2,String.valueOf(strength));
        values.add(weapon);
        return  values;
    }
    @Override
    public void read(List<String> savedValues){
        if(savedValues!=null && savedValues.size()>=4){
            this.name=savedValues.get(0);
            this.hitPoints=Integer.parseInt(savedValues.get(1));
            this.strength=Integer.parseInt(savedValues.get(2));
            this.weapon=savedValues.get(3);
        }
    }
}
