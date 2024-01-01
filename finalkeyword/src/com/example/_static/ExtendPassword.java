package com.example._static;

public class ExtendPassword extends Password{
    private int decryptedPassword;

    public ExtendPassword(int password){
        super(password);
        this.decryptedPassword=password;
    }

//    @Override //made final cannot override ,cannot hide
//    public void storePassword(){
//        System.out.println("Storing passwrod as  "+decryptedPassword);
//    }

    public int getPassword(){ //but still we can access password
        return decryptedPassword;
    }
}
