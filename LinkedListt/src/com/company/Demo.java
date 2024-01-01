package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit=new LinkedList<>();
        addInOrder(placesToVisit,"sydney");
        addInOrder(placesToVisit,"melbourne");
        addInOrder(placesToVisit,"brisbone");
        addInOrder(placesToVisit,"perth");
        addInOrder(placesToVisit,"canberra");
        addInOrder(placesToVisit,"adelaide");
        addInOrder (placesToVisit,"darwin");
        addInOrder (placesToVisit,"Zarwin");
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbone");
//        placesToVisit.add("perth");
//        placesToVisit.add("canberra");
//        placesToVisit.add("adelaide");
//        placesToVisit.add("darwin");
//        placesToVisit.add(1,"Alice Springs");
        printList(placesToVisit);
        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i=linkedList.iterator();
        while(i.hasNext())
            System.out.println("Now visiting "+i.next());
        System.out.println("===============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator=linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparison=stringListIterator.next().compareTo(newCity);
            if(comparison==0){
                //equal do not add
                System.out.println(newCity+" Already in the list");
                return false;
            }else if(comparison>0){
                //new city come before current one
                stringListIterator.previous(); //double linked list
                stringListIterator.add(newCity);
                return true;
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList<String> cities){
        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        boolean goingForward=true;
        ListIterator<String> listIterator=cities.listIterator();
        if(cities.isEmpty())
            System.out.println("No cities");
        else {
            System.out.println("Now visiting "+listIterator.next());
            printMenu();
        }
        while (!quit){
            int action=scanner.nextInt();
            scanner.nextLine();
            switch (action){
            case 0:
                System.out.println("Holiday (Vacation) Over");
                quit=true;
                break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext())
                            listIterator.next();
                        goingForward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting "+listIterator.next());;
                    }
                    else {
                        System.out.println("reached the end of the list");
                        goingForward=false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious())
                            listIterator.previous();
                        goingForward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting "+listIterator.previous());
                    }else
                        System.out.println("We are at the start of the list");
                    goingForward=true;
                        break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }
    private  static void printMenu(){
        System.out.println("Available Actions :\nPress :");
        System.out.println("0 -> quit");
        System.out.println("1 -> nextCity");
        System.out.println("2 -> previousCity");
        System.out.println("3 -> printMenu");
    }
}
