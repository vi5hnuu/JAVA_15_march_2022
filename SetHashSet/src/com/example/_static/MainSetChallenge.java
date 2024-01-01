package com.example._static;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainSetChallenge {
    private final static Map<HeavenlyBodySetChallenge.Key,HeavenlyBodySetChallenge> solarSystem=new HashMap<>();
    private final static Set<HeavenlyBodySetChallenge> planets=new HashSet<>();
    public static void main(String[] args) {
        HeavenlyBodySetChallenge temp=new Planet("Mercury",88);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp=new Planet("Venus",225);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp=new Planet("Earth",365);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);
        //earth has moon
        HeavenlyBodySetChallenge tempMoon=new Moon("Moon",27);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatellite(tempMoon);


        temp=new Planet("Mars",687);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);
        tempMoon=new Moon("Deimos",1.3);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon=new Moon("Phobos",0.3);
        solarSystem.put(temp.getKey(),tempMoon);
        temp.addSatellite(tempMoon);

        temp=new Planet("Jupiter",4332);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);
        tempMoon=new Moon("Io",1.8);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatellite(tempMoon);
        tempMoon=new Moon("Europa",3.5);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatellite(tempMoon);
        tempMoon=new Moon("Ganymede",7.1);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatellite(tempMoon);
        tempMoon=new Moon("Callisto",16.7);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatellite(tempMoon);

        temp=new Planet("Saturn",10759);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp=new Planet("Uranus",30660);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);
        temp=new Planet("Neptune",165);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);
        temp=new Planet("Pluto",248);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        System.out.println("Planets");
        for(HeavenlyBodySetChallenge planet:planets) {
            HeavenlyBodySetChallenge.Key planetName=planet.getKey();
            System.out.println("\t" +planetName );
            HeavenlyBodySetChallenge body=solarSystem.get(planetName);

            System.out.println("\t\t::Moons of "+body.getKey().getName());
            boolean flag=true;
            for(HeavenlyBodySetChallenge jupiterMoon: body.getSatellite()){
                flag=false;
                System.out.println("\t\t\t"+jupiterMoon.getKey());
            }
            if(flag)
                System.out.println("\t\t\tNo Moons");
        }

        Set<HeavenlyBodySetChallenge> moons=new HashSet<>();
        for(HeavenlyBodySetChallenge planet:planets)
            moons.addAll(planet.getSatellite());

        System.out.println("All Moons :-:>");
        for(HeavenlyBodySetChallenge moon: moons)
            System.out.println("\t"+moon.getKey());

//        HeavenlyBodySetChallenge pluto=new DwarfPlanet("Pluto",842);
        HeavenlyBodySetChallenge pluto=new Planet("Pluto",842);
        planets.add(pluto); //not added to solar system


        for(HeavenlyBodySetChallenge planet:planets)
            System.out.println(planet);

        HeavenlyBodySetChallenge earth1=new Planet("Earth",365);
        HeavenlyBodySetChallenge earth2=new Planet("Earth",365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth2.equals(pluto));
        System.out.println(pluto.equals(earth1));

        solarSystem.put(pluto.getKey(),pluto); //aded to solar system
        System.out.println(solarSystem.get(HeavenlyBodySetChallenge.makeKey("Pluto",HeavenlyBodySetChallenge.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBodySetChallenge.makeKey("Pluto",HeavenlyBodySetChallenge.BodyTypes.DWARF_PLANET)));


        System.out.println("=========================");
        System.out.println("The solar System contains :");
        for(HeavenlyBodySetChallenge hbsC:solarSystem.values()){
            System.out.println(hbsC);
        }
    }
}
