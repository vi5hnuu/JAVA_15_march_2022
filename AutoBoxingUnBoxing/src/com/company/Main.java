package com.company;

import java.util.ArrayList;
class intcls{
    private int value;
    public intcls(int value){
        this.value=value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public static intcls valueOf(int x){
        return new intcls(x);
    }
    public int getValue() {
        return value;
    }
    @Override
    public String toString(){
      return value+"";
    }
}

public class Main {

    public static void main(String[] args) {
    String[] strArray=new String[10];
    int[] intArray=new int[10];

//        ArrayList<String> strArrayList=new ArrayList<>();//ok
//        ArrayList<int> intArrayList=new ArrayList<>();//only class object arraylist is possible for primitive we
        //have wrapper class

        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
//        ArrayList<intcls> intclsArrayList=new ArrayList<>();
//        intclsArrayList.add(new intcls(5));
//        intclsArrayList.add(new intcls(6));
//        intclsArrayList.add(new intcls(7));
//        intclsArrayList.add(new intcls(8));
//        System.out.println(intclsArrayList);
//        System.out.println(intclsArrayList.get(2));//intclsArrayList.get(2).toString();
        /////////////////////////////////////////////////////
        //////////////////////doubt////////////////////////
        ArrayList<intcls> intclsArrayList=new ArrayList<intcls>();
        intclsArrayList.add(5);
        intclsArrayList.add(6);
        intclsArrayList.add(7);
        intclsArrayList.add(8);
        System.out.println(intclsArrayList);
        System.out.println(intclsArrayList.get(2));//intclsArrayList.get(2).toString();
        //or use inclsArrayList.get(2).getValue()[of intcls class];
        /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////
//        ArrayList<Integer> intclsArrayList=new ArrayList<>();
//        intclsArrayList.add(5);//auto Boxing
//        intclsArrayList.add(6);//Integer.valueOf(6); return Integer
//        intclsArrayList.add(7);
//        intclsArrayList.add(8);
//
//
//        System.out.println(intclsArrayList);
//        System.out.println(intclsArrayList.get(2));//intclsArrayList.get(2).toString()[of Integer class];

            }
}
