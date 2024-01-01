package com.company;

//pc has case,monitor,motherboard
public class Pc {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    //remember the object pass reference
    public Pc(Case thecase,Monitor monitor,MotherBoard motherBoard){
        this.theCase=thecase;
        this.monitor=monitor;
        this.motherBoard=motherBoard;
    }
    public void powerUp(){
//        getTheCase().pressPowerButton();
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
//        getMonitor().drawpixelAt(1200,50,"yellow");
        monitor.drawpixelAt(1200,50,"yellow");
    }
//    private Case getTheCase(){
//        return theCase;
//    }
//    private Monitor getMonitor(){
//        return monitor;
//    }
//    private MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
}
