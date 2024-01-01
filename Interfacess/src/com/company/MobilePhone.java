package com.company;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber){
        this.myNumber=myNumber;
        isOn=false;
    }

    @Override
    public void powerOn() {
        System.out.println("Powered on");
        isOn=true;
    }

    @Override
    public void dial(int phoneNumer) {
        if(isOn)
        System.out.println("Now ringging "+phoneNumer+" on mobilePhone");
        else{
            System.out.println("Switched off");
        }
    }

    @Override
    public void where() {
        ITelephone.super.where();
        System.out.println("override in class 'MobilePhone'");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging=false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber && isOn){
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
