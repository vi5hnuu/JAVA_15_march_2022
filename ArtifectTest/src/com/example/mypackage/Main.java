package com.example.mypackage;

import com.example.game.ISavable;
import com.example.game.Monster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        ISavable tim=new Player("Tim",10,15);
//        System.out.println(tim);
//        saveObject(tim);
//        tim.setHitPoints(8);
//        System.out.println(tim);
//        tim.setWeapon("Strombringer");
//        saveObject(tim);
//        loadObject(tim);
//        System.out.println(tim);

        ISavable wereWolf=new Monster("WereWolf",20,40);
        System.out.println(wereWolf);
        System.out.println(((Monster)wereWolf).getStrength());
        saveObject(wereWolf);
        loadObject(wereWolf);
        System.out.println(wereWolf);
    }

    public static ArrayList<String> readvalues(){
        ArrayList<String> values=new ArrayList<>();
        Scanner scn=new Scanner(System.in);
        boolean quit=false;
        int index=0;
        System.out.println("Choice :\n"+"1 to enter a string\n0 to quit");
        while (!quit){
            System.out.println("chose an Option :");
            int choice =scn.nextInt();
            scn.nextLine();
            switch (choice){
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.print("Enter a string :");
                    String strintInput=scn.nextLine();
                    values.add(index++,strintInput);
                    break;
            }
        }
        scn.close();
        return values;
    }

    public static void saveObject(ISavable objToSave){
        List<String> obj=objToSave.write();
        for(int i=0;i<obj.size();i++){
            System.out.println("Saving "+obj.get(i)+" to storage device");
        }
    }

    public static void loadObject(ISavable objToLoad){
        List<String> values=readvalues();
        objToLoad.read(values);
    }
}
