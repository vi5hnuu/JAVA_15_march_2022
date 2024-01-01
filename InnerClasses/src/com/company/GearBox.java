//package com.company;
//
//import java.util.ArrayList;
//
//public class GearBox {
//    private ArrayList<Gear> gears;
//    private int maxGears;
//    private int currentGear;
//
//    public GearBox(int maxGears){
//        this.currentGear =maxGears;
//        this.gears=new ArrayList<Gear>();
//        currentGear =0;
//        Gear neutral=new Gear(0,0.0);
//        this.gears.add(neutral);
//    }
//
//    public class Gear{
//        private int gearNumber;
//        private int maxGears;
//        private double ratio;
//
//        public Gear(int gearNumber,double ratio){
//            this.gearNumber=gearNumber;//shadow...this.gearNumber is of this.--- not outer
//            this.ratio=ratio;
//        }
//
//        public double driveSpeed(int revs){
//            return revs*(this.ratio);
//        }
//    }
//}


///////////////////////////////////////////////////
///////////////////////////////////////////////////
//////////////////////V2//////////////////////////

package com.company;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear;
    private boolean clutchIsIn;

    public GearBox(int maxGears){
        this.maxGears =maxGears;
        this.gears=new ArrayList<Gear>(maxGears);
        currentGear =0;
        for(int i=0;i<maxGears;i++)
            gears.add(new Gear(i,i*5.3));
    }

    public void operateClutch(boolean in){
        this.clutchIsIn=in;
    }

    private void addGear(int number,double ratio){
        if(number>0 && (number<maxGears)){
            this.gears.add(new Gear(number,ratio));
        }
    }

    public void changeGear(int newGear){
        if((newGear>=0) && (newGear<this.gears.size()) && this.clutchIsIn){
            this.currentGear=newGear;
            System.out.println("Gear "+newGear+" selected");
        }else{
            System.out.println("Grind");
            this.currentGear=0;
        }
    }

    public String wheelSpeed(int revs){
        if(clutchIsIn){
            System.out.println("Scream!!!");
            return "0.0";
        }
        return revs*gears.get(currentGear).getRatio()+" Gear no :"+gears.get(currentGear).getGearNumber();
    }

    private class Gear{
        private int gearNumber;
        private double ratio;

        private Gear(int gearNumber,double ratio){
            this.gearNumber=gearNumber;//shadow...this.gearNumber is of this.--- not outer
            this.ratio=ratio;
        }
        private double getRatio(){
            return ratio;
        }
        private int getGearNumber(){
            return gearNumber; //current gear the body has
        }

        private double driveSpeed(int revs){
            return revs*(this.ratio);
        }
    }
}
