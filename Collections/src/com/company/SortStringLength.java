package com.company;

import java.util.Comparator;

public class SortStringLength {
    public static void main(String[] args) {
        String[] cities={"Atlanta","Savannah","New Yonrk","Dallas"};
        java.util.Arrays.sort(cities,new MyComparator());

        for(String s:cities)
            System.out.println(s+" ");
    }

    public static class MyComparator implements Comparator<String>{
        @Override
        public int compare(String s1,String s2){
            return s1.length()-s2.length();
        }
    }
}
