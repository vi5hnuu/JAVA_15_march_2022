package com.example._static;

import javax.management.modelmbean.ModelMBeanOperationInfo;
import java.util.*;

public class Main {
    private final static Map<String,HeavenlyBody> solarSystem=new HashMap<>();
    private final static Set<HeavenlyBody> planets=new HashSet<>();
    public static void main(String[] args) {
        HeavenlyBody temp=new HeavenlyBody("Mercury",88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp=new HeavenlyBody("Venus",225);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp=new HeavenlyBody("Earth",365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        //earth has moon
        HeavenlyBody tempMoon=new HeavenlyBody("Moon",27);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);


        temp=new HeavenlyBody("Mars",687);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        tempMoon=new HeavenlyBody("Deimos",1.3);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        tempMoon=new HeavenlyBody("Phobos",0.3);
        solarSystem.put(temp.getName(),tempMoon);
        temp.addMoon(tempMoon);

        temp=new HeavenlyBody("Jupiter",4332);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        tempMoon=new HeavenlyBody("Io",1.8);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);
        tempMoon=new HeavenlyBody("Europa",3.5);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);
        tempMoon=new HeavenlyBody("Ganymede",7.1);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);
        tempMoon=new HeavenlyBody("Callisto",16.7);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        temp=new HeavenlyBody("Saturn",10759);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp=new HeavenlyBody("Uranus",30660);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        temp=new HeavenlyBody("Neptune",165);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        temp=new HeavenlyBody("Pluto",248);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        System.out.println("Planets");
        for(HeavenlyBody planet:planets) {
            String planetName=planet.getName();
            System.out.println("\t" +planetName );
            HeavenlyBody body=solarSystem.get(planetName);

            System.out.println("\t\t::Moons of "+body.getName());
            boolean flag=true;
            for(HeavenlyBody jupiterMoon: body.getSatellite()){
                flag=false;
                System.out.println("\t\t\t"+jupiterMoon.getName());
            }
            if(flag)
                System.out.println("\t\t\tNo Moons");
        }

        Set<HeavenlyBody> moons=new HashSet<>();
        for(HeavenlyBody planet:planets)
            moons.addAll(planet.getSatellite());

        System.out.println("All Moons :-:>");
        for(HeavenlyBody moon: moons)
            System.out.println("\t"+moon.getName());

        //what if equlas hashCode is not overridden //cmnt equlas and hashCode(which bucket to go..video 164) in HeavenylyBody
//        HeavenlyBody pluto=new HeavenlyBody("Pluto",842);
        HeavenlyBody pluto=new HeavenlyBody("Pluto",248);
        planets.add(pluto);


        for(HeavenlyBody planet:planets)
            System.out.println(planet.getName()+" "+planet.getOrbitaPeriod());
        //both pluto added because when planet set comapred new pluto with old pluto it called equals method of object class
        // as there is no equals mathod overridden for Heavenlt body..
        //so equals in this case just compare address(this==obj) not ctual values inside the objects...
        //so override it in heavenyly body class
        //same reason for keys duplicate in map..
    }

}
