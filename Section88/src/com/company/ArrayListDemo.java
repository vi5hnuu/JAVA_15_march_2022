package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDemo {
    private int[] myNumber=new int[50];
    private ArrayList<String> lst = new ArrayList<>(); //Object->abstractCollection->AbstractList->ArrayList
//implements clonable,Collection<>,List<>,RandomAccess,Serializable
    public ArrayList<String> getLst(){
        return lst;
    }
    public  void addGroceryItems(String item){
        lst.add(item);
    }
    public void printGroceryList(){
//        System.out.println(lst); //lst.toString();
        for(int i=0;i<lst.size();i++)
            System.out.println(i+" "+lst.get(i));
    }
    private void modify(int position,String newItem){//you can make it private if u want to use it internally onlyy
        lst.set(position,newItem);
    }//we dont actually need position
    public void modify(String oldItem,String newItem){
        int position=findItem(oldItem);
        if(position>=0)
            modify(position,newItem);
    }
    private void removeGroceryItem(int position){
        String theItem=lst.get(position);
        lst.remove(position);
        //there are two remove method remove(object),remove(index)
        //you might wonder what if arraylist is of integers and it
        //contains element 2 and you want to remove at index 2 not element 2
        //and you called remove(index:2)..it will remove at at index 2 bcause arraylist is for objects not for primitive...
        System.out.println("Removed "+theItem);
    } //you can make it private if u want to use it internally onlyy
    public void removeGroceryItem(String item){
        int position=findItem(item);
        if(position>=0)
            removeGroceryItem(position);
    }
    private int findItem(String searchItem){
//        boolean exist=lst.contains(searchItem);
        int position=lst.indexOf(searchItem);
        return position;
    }
    public boolean onFile(String searchItem){
        int position=findItem(searchItem);
        if(position>=0)
            return true;
        else
            return false;
    }
}
