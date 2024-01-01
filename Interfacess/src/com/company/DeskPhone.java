package com.company;

public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;


    public DeskPhone(int myNumber){
        this.myNumber=myNumber;
    }
    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumer) {
        System.out.println("Now ringging "+phoneNumer+" on deskphone");;
    }

//    @Override
//     void where() { //where is pulic in interface by default
//        //so we shoul use public here ..(we cannot assign weaker modifier)
//        ITelephone.super.where();
//    }
    @Override
    public void where() {
    ITelephone.super.where();
        System.out.println("override in class 'DeskPhone'");
    }

    @Override
    public void answer() {
    if(isRinging){
        System.out.println("Answering the desk phone");
        isRinging=false;
    }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
     if(phoneNumber==myNumber){
         isRinging=true;
         System.out.println("Ringing");
     }else{
         isRinging=false;
     }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
