package com.example._static;

import java.sql.SQLOutput;

public class Password {
//    private static final int KEY=74856213;
    private static final int KEY=456423;//ctor can be use to assign normal static variables  but not static final as it is final and on every call static is executed in ctor
    private final int encryptedPassword;
//    private static int x; //default 0 coz it is not final
//    static {
//        KEY=12345;
//        x=20;
//    }
    public Password(int password){
        this.encryptedPassword=encryptDecrypt(password);
    }

    public int encryptDecrypt(int password){
        return password^KEY;
    }

    public final void storePassword(){ //neither we can overrid nor it can be hidden
//    public void storePassword(){
        System.out.println("Storing password as "+encryptedPassword);
    }

    public boolean letMeIn(int password){
        if(encryptDecrypt(password)==this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        }else{
            System.out.println("Wrong password");
            return false;
        }
    }
}
