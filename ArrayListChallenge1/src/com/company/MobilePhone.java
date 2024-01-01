package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber=myNumber;//a phone must have owner number
        this.myContacts=new ArrayList<Contact>();
    }
    public boolean addnewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Contatc is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }//return index or neg
    private int findContact(String contactName){
        for(int i=0;i<this.myContacts.size();i++){
            if(this.myContacts.get(i).getName().equals(contactName))
                return i;
            //not compatible when we have same name contact ....in that case first match is returned
        }
        return -1;
    }//return index or neg
    public boolean updateContact(Contact oldContact,Contact newContact){
        int foundPosition=findContact(oldContact);
        if(foundPosition<0){
            System.out.println(oldContact.getName()+", was not dound.");
            return false;
        }
        else if(findContact(newContact.getName())!=-1){
            System.out.println("Same name contact not alloweded");
            return false;
        }
        this.myContacts.set(foundPosition,newContact);
        System.out.println(oldContact.getName()+" is replced with "+newContact.getName());
        return true;
    }
    public String queryContact(Contact contact){
        if(findContact(contact)>=0)
            return contact.getName();
        return null;
    }
    public Contact queryContact(String contactName){
        int position=findContact(contactName);
        if(position>=0)
            return this.myContacts.get(position);
        return null;
    }
    public void printContacts(){
        for(int i=0;i<this.myContacts.size();i++){
            System.out.println(i+1+"."+this.myContacts.get(i).getName()+"->"+this.myContacts.get(i).getPhoneNumber());
        }
    }
    public boolean removeContact(Contact contact){
        int foundPosition=findContact(contact);
        if(foundPosition<0){
            System.out.println(contact.getName()+", was not dound.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName()+", was deleted");
        return true;
    }
}
