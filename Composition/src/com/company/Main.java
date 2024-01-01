package com.company;
//we can create the object directly inside the pc class so that they got deleted asa the object of class pc is deleted
//because Dimension,case,monitor,motheerboard should not worl individually


public class Main {

    public static void main(String[] args) {
    Dimension dimension=new Dimension(20,10);
    Case theCase=new Case("220B","Dell","240",dimension);
    Monitor theonitor=new Monitor("27Inch Beast","Acer",27,new Resulation(2540,1440));
    MotherBoard theMotherBoard=new MotherBoard("Bj-200","Asus",4,4,"v2.44");
    Pc thePc=new Pc(theCase,theonitor,theMotherBoard);
//    thePc.getMonitor().drawpixelAt(1500,1200,"red");
//    thePc.getMotherBoard().loadProgramm("Windows 10");

        thePc.powerUp();
    }
}
