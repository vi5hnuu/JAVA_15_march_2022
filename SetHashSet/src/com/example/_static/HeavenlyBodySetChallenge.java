package com.example._static;

import java.util.HashSet;
import java.util.Set;


//extending static classes is allowed, since its members
//are not necessarily static. the static modifier can only be used
//on nested classes because it can only be used on
//class members (and only nested classes can be class members)

public abstract class HeavenlyBodySetChallenge {
    private final Key key;
    private final double orbitaPeriod;
    private final Set<HeavenlyBodySetChallenge> satellite;

    //you can also use enum
//    public static final int STAR;
//    public static final int PLANET;
//    public static final int DWARF_PLANET;
//    public static final int MOON;
//    public static final int COMET;
//    public static final int ASTEROID;
//    static {
//        STAR=1;
//        PLANET=2;
//        DWARF_PLANET=3;
//        MOON=4;
//        COMET=5;
//        ASTEROID=6;
//    }
    public enum BodyTypes{

        STAR(1),
        PLANET(2),
        DWARF_PLANET(3),
        MOON(4),
        COMET(5),
        ASTEROID(6);
        private final int val;
        BodyTypes(int x){
            this.val=x;
        }
//        public int getValue(){
//            return this.val;
//        }
    }

    public HeavenlyBodySetChallenge(String name, double orbitaPeriod,BodyTypes type){
        this.key=new Key(name,type);
        this.orbitaPeriod=orbitaPeriod;
        this.satellite=new HashSet<>();
    }

    public double getOrbitaPeriod(){

        return orbitaPeriod;
    }
    public Key getKey(){
        return key;
    }
    public boolean addSatellite(HeavenlyBodySetChallenge moon){
        return this.satellite.add(moon);
    }

    public Set<HeavenlyBodySetChallenge> getSatellite(){

        return new HashSet<>(satellite);
    }

    @Override
    public final int hashCode() {
//        System.out.println("HashCode called "+this.name.hashCode()+57);
        return this.key.hashCode();
    }

    @Override
    public final boolean equals(Object obj){
        if(this==obj)
            return true;

        if(obj instanceof HeavenlyBodySetChallenge) {
            HeavenlyBodySetChallenge theObject = (HeavenlyBodySetChallenge) obj;
            return this.key.equals(theObject.key);
        }
       return false;
    }

    @Override
    public String toString(){
        return this.key.name+" : "+this.key.bodyType+", "+this.orbitaPeriod;
    }
    public static Key makeKey(String name,BodyTypes bodyType){
        return new Key(name,bodyType);
    }
    public static final class Key{
        private String name;
        private BodyTypes bodyType;

        private Key(String name,BodyTypes bodyType){
            this.name=name;
            this.bodyType=bodyType;
        }
        public String getName(){
            return this.name;
        }
        public BodyTypes getBodyType(){
            return bodyType;
        }



        @Override
        public int hashCode(){
            return this.name.hashCode()+57+this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj){
            Key key=(Key)obj;
            if(this.name.equals(key.getName()))
                return (this.bodyType==key.getBodyType());
            return false;
        }
        @Override
        public String toString(){
            return this.name+" : "+this.bodyType;
        }
    }

}
