package com.company;

import java.util.List;

import static java.util.List.of;

public class SortingStringIgnoreCase {
    public static void main(String[] args) {
        List<String> cities=java.util.Arrays.asList("Atlanta","Savannah","New York");
        cities.sort((s1,s2)->s1.compareToIgnoreCase(s2));
        for(String s:cities)
            System.out.println(s+" ");
    }
}
