package com.company;

import java.util.Scanner;

public class Main {

    //V1
//    public static void main(String[] args) {
//        GearBox mcLaren=new GearBox(6);
//        GearBox.Gear first=mcLaren.new Gear(1,12.3);
////        GearBox.Gear first=new GearBox.Gear(1,12.3);
////        GearBox.Gear first=new mcLaren.Gear(1,12.3);
//        System.out.println(first.driveSpeed(1000));
//    }

//    V2
//    public static void main(String[] args) {
//        GearBox mcLaren=new GearBox(6);
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));
//    }


    /////////////////local class..Button.java
    private static Scanner scanner=new Scanner(System.in);
    private static Buttonn btnPrint=new Buttonn("Print");

    public static void main(String[] args) {
    //class in (local)main;
//        class ClickListeener implements Buttonn.onClickListener{
//            public ClickListeener(){
//                System.out.println("I've listened");
//            }
//            @Override
//            public void onClick(String title){
//                System.out.println(title+" was clicked");
//            }
//
//
//       }
//                    btnPrint.setOnClickListener(new ClickListeener());



    /*Anonymous class*/
        btnPrint.setOnClickListener(new Buttonn.onClickListener(){/*() for new object creation(ctor)*/
        @Override
        public void onClick(String title){
        System.out.println(title+" was clicked");
        }
        });
        listen();
        }

    private static void listen(){
        boolean quit=false;
        while(!quit){
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:quit=true;break;
                case 1:
                    btnPrint.onClick();break;
            }
        }

    }
}
