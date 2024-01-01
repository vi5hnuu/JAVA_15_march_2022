package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner input=new Scanner(System.in);
    private static MobilePhone mobilePhone=new MobilePhone("9785855892");
    public static void main(String[] args) {
    boolean quit=false;
    startPhone();
    printActions();
    while(!quit){
        System.out.println("\nEnter Action:");
        int action=input.nextInt();
        input.nextLine();

        switch (action){
            case 0:
                System.out.println("\nShutting down...");quit=true;break;
            case 1:System.out.println("Contact List");
                mobilePhone.printContacts();break;
            case 2:addNewContact();break;
            case 3:updateContact();break;
            case 4: removeContact();break;
            case 5:queryContact();break;
            case 6:printActions();break;
            default:
                System.out.println("use choice between 0 to 6 only");
        }
    }
    }
    public static void updateContact(){
        System.out.println("Enter existing contact name :");
        String name=input.nextLine();
        Contact existing=mobilePhone.queryContact(name);
        if(existing==null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name :");
        String newName=input.nextLine();
        System.out.println("Enter new Phone Number :");
        String newPhoneNumber=input.nextLine();
        Contact newContact=Contact.createContact(newName,newPhoneNumber);
        if(mobilePhone.updateContact(existing,newContact))
            System.out.println("Successfully updated record");
        else
            System.out.println("Error updating record");
    }
    public static void removeContact(){
        System.out.println("Enter existing contact name :");
        String name=input.nextLine();
        Contact existing=mobilePhone.queryContact(name);
        if(existing==null){
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existing))
            System.out.println("deleted successful");
        else
            System.out.println("deleted failed");
    }
    public static void queryContact(){
        System.out.println("Enter existing contact name :");
        String name=input.nextLine();
        Contact existing=mobilePhone.queryContact(name);
        if(existing==null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name:"+existing.getName()+" phoneNumber: "+existing.getPhoneNumber());
    }
    private static void addNewContact(){
        System.out.println("Enter new contact name :");
        String name=input.nextLine();
        System.out.println("ENter phone number :");
        String phoneNumber=input.nextLine();
        Contact newContact=Contact.createContact(name,phoneNumber);
        if(mobilePhone.addnewContact(newContact))
            System.out.println("New contact added "+name+" "+phoneNumber);
        else
            System.out.println("Contact already present !");
    }
    private static void startPhone(){
        System.out.println("Starting phone.....");
    }
    private static void printActions(){
        System.out.println("\nAvailable actions:\nPress");
        System.out.println("0 -to ShutDown");
        System.out.println("1 -to print contacts");
        System.out.println("2 -to add new contact");
        System.out.println("3 -to update existing an contact");
        System.out.println("4 -to remove an existing contact");
        System.out.println("5 -query if a contact exist");
        System.out.println("6 -to print a list of available contact");
        System.out.print("Choose an action :");
    }
}
