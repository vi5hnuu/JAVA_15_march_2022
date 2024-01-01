package com.company;
import java.util.Scanner;

public class GuessBirthday {
    private static String set1,set2,set3,set4,set5;

    public GuessBirthday(){
        set1="1 3 5 7\n" +
                " 9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31";
        set2="2 3 6 7\n" +
                 "10 11 14 15\n" +
                 "18 19 22 23\n" +
                 "26 27 30 31";
        set3="4 5 6 7\n" +
                 "12 13 14 15\n" +
                 "20 21 22 23\n" +
                 "28 29 30 31";
        set4="8 9 10 11\n" +
                 "12 13 14 15\n" +
                 "24 25 26 27\n" +
                 "28 29 30 31";
        set5="16 17 18 19\n" +
                 "20 21 22 23\n" +
                 "24 25 26 27\n" +
                 "28 29 30 31";
    }
    public int GuessDateOfBirth(){ //if this method is static dont you thing ctor will not be called as obj is not created
        //and set 1 to 5 will all be null so do not make it static
        int date=0;
        char isInThisSet;
        Scanner input = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            switch (i){
                case 1:
                    System.out.println(set1);;break;
                case 2:System.out.println(set2);;break;
                case 3:System.out.println(set3);;break;
                case 4:System.out.println(set4);;break;
                case 5:System.out.println(set5);;break;
            }
            System.out.print("Is your birthday in Set"+i+"?(Y/N)\n");
            isInThisSet=input.nextLine().charAt(0);
            if(isInThisSet=='y'){
                switch (i){

                    case 1:date+=Integer.parseInt(set1.charAt(0)+"");System.out.println(date);break;
                    case 2:date+=Integer.parseInt(set2.charAt(0)+"");System.out.println(date);break;
                    case 3:date+=Integer.parseInt(set3.charAt(0)+"");System.out.println(date);break;
                    case 4:date+=Integer.parseInt(set4.charAt(0)+"");System.out.println(date);break;
                    case 5:date+=Integer.parseInt(set5.charAt(0)+""+set5.charAt(1));System.out.println(date);break;
                }
            }

        }
        return date;
    }
}
