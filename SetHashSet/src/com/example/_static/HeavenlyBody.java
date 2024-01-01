package com.example._static;

import java.util.*;
public final class HeavenlyBody {
    private final String name;
    private final double orbitaPeriod;
    private final Set<HeavenlyBody> satellite;

    public HeavenlyBody(String name,double orbitaPeriod){
        this.name=name;
        this.orbitaPeriod=orbitaPeriod;
        this.satellite=new HashSet<>();
    }

    public String getName(){
        return name;
    }

    public double getOrbitaPeriod(){
        return orbitaPeriod;
    }

    public boolean addMoon(HeavenlyBody moon){
        return this.satellite.add(moon);
    }

    public Set<HeavenlyBody> getSatellite(){
        return new HashSet<>(satellite);
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode called "+this.name.hashCode()+57);
        return this.name.hashCode()+57;
    }

    @Override
    public boolean equals(Object ob){
        if(this==ob)
            return true;
        System.out.println("Hashcode matched");
//        System.out.println("obj.getClass() is "+ob.getClass());
//        System.out.println("this.getClass() is "+this.getClass());
//        if(ob==null || ob.getClass()!=this.getClass()) //unnecessay as this class is final
//            //it cannot have subclass and as set himself is calling this method means Object obj point only to heavenly class object so no need of this code
//            return false;
        //String is also final class

        String obName=((HeavenlyBody)ob).name;
        return this.name.equals(obName); //comparing obly based on name
    }
}
