package com.company;

public class MaxUSingGenericType {//only E is like E extends Object which do not have compareTo at compile time

    public static void main(String[] args) {
        System.out.println(MaxUSingGenericType.<String>max("Vishnu","Krishan"));
        System.out.println(max("Vishnu","Krishan"));
    }

    public static <E extends Comparable<E>> E max(E o1,E o2){
        if(o1.compareTo(o2)>0)
            return o1;
        else
            return o2;
    }
}
