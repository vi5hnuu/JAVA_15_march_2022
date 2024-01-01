//package com.company;
//
//import javax.security.sasl.SaslClient;
//import java.util.Scanner;
//
//public class TestArrayListDemo {
//    private static Scanner input=new Scanner(System.in);
//    private static ArrayListDemo demo=new ArrayListDemo();
//    public static void main(String[] args){
//        boolean quit=false;
//        int choice=0;
//        printInstructions();
//        while(!quit){
//            System.out.println("Enter choice :");
//            choice=input.nextInt();
//
//            switch (choice){
//                case 0:printInstructions();break;
//                case 1: demo.printGroceryList(); break;
//                case 2: addItem();break;
//                case 3: modifyItem();break;
//                case 4: removeItem();break;
//                case 5:searchForItem();break;
//                case 6:quit=true;break;
//            }
//        }
//    }
//    public static void printInstructions(){
//        System.out.println("\nPress ");
//        System.out.println("\t 0 To print chice Options.");
//        System.out.println("\t 1 to print list of grocery items");
//        System.out.println("\t 2 to add item to the list");
//        System.out.println("\t 3 to modify item in the list");
//        System.out.println("\t 4 to remove item to list");
//        System.out.println("\t 5 to search for an item in the list");
//        System.out.println("\t 6 t quit aplication");
//    }
//    public static void addItem(){
//        System.out.print("Please enter the frocery item :");
//        input.nextLine(); //you dont know if prev operatioun used token functions like nextInt()
//        demo.addGroceryItems(input.nextLine());
//    }
//    public static void modifyItem(){
//        System.out.print("Enter item number :");
//        int itemNo=input.nextInt();
//        System.out.println("Enter replacement Item :");
//        input.nextLine();
//        String newItem=input.nextLine();
//        demo.modify(itemNo-1,newItem);
//    }
//    public static void removeItem(){
//        System.out.print("Enter item number :");
//        int itemNo=input.nextInt();
//        demo.removeGroceryItem(itemNo);
//    }
//    public static void searchForItem(){
//        System.out.print("Enter item to search for :");
//        input.nextLine(); //you dont know if prev operatioun used token functions like nextInt()
//        String searchItem=input.nextLine();
//        if(demo.onFile(searchItem))
//            System.out.println("Found "+searchItem+ " in our grocery list");
//        else
//            System.out.println(searchItem+" is not n out rocery list");
//    }
//}

///////////////////////////////////////////
///////////////////////////////////////////
package com.company;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayListDemo {
    private static Scanner input=new Scanner(System.in);
    private static ArrayListDemo demo=new ArrayListDemo();
    public static void main(String[] args){
        boolean quit=false;
        int choice=0;
        printInstructions();
        while(!quit){
            System.out.println("Enter choice :");
            choice=input.nextInt();//leave space and \n
            input.nextLine(); //consume  spaces* and \n
            switch (choice){
                case 0:printInstructions();break;
                case 1: demo.printGroceryList(); break;
                case 2: addItem();break;
                case 3: modifyItem();break;
                case 4: removeItem();break;
                case 5:searchForItem();break;
                case 6:processList();break;
                case 7:quit=true;break;
            }
        }
    }
    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 To print chice Options.");
        System.out.println("\t 1 to print list of grocery items");
        System.out.println("\t 2 to add item to the list");
        System.out.println("\t 3 to modify item in the list");
        System.out.println("\t 4 to remove item to list");
        System.out.println("\t 5 to search for an item in the list");
        System.out.println("\t 6 to process list");
        System.out.println("\t 6 t quit aplication");
    }
    public static void addItem(){
        System.out.print("Please enter the frocery item :");
//        input.nextLine();//we ready choice before //cmnt and add next line below were we read choice
        demo.addGroceryItems(input.nextLine());
    }
    public static void modifyItem(){
        System.out.print("Enter oldItem :");
//        input.nextLine(); //we ready choice before //cmnt and add next line below were we read choice
        String itemold=input.nextLine();
        System.out.println("Enter replacement Item :");
        String newItem=input.nextLine();
        demo.modify(itemold,newItem);
    }
    public static void removeItem(){
//        input.nextLine();//we ready choice before //cmnt and add next line below were we read choice
        System.out.print("Enter item number :");
        String item=input.nextLine();
        demo.removeGroceryItem(item);
    }
    public static void searchForItem(){
//        input.nextLine();//we ready choice before //cmnt and add next line below were we read choice
        System.out.print("Enter item to search for :");
        String searchItem=input.nextLine();
        if(demo.onFile(searchItem))
            System.out.println("Found "+searchItem+ " in our grocery list");
        else
            System.out.println(searchItem+" is not n out rocery list");
    }
    public static void processList(){
//        ArrayList<String> newArray=new ArrayList<>();
//        newArray.addAll(demo.getLst());

//        ArrayList<String> nextArray=new ArrayList<>(demo.getLst());
        String[] myArray=new String[demo.getLst().size()];
        demo.getLst().toArray(myArray);
//        myArray=demo.getLst().toArray(myArray);

//        String[] myArray; //not working
//        myArray=(String[]) (demo.getLst().toArray());
        for(String x:myArray)
            System.out.println(x);
    }
}
