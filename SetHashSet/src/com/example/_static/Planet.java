package com.example._static;

public class Planet extends HeavenlyBodySetChallenge{
    public Planet(String name,double orbitalPeriod){
        super(name,orbitalPeriod,BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBodySetChallenge moon){
        if(moon.getKey().getBodyType()==BodyTypes.MOON)
            return super.addSatellite(moon);
        else
            return false;
    }
}
