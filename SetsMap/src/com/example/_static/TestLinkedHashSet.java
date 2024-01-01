package com.example._static;

import java.util.*;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("Bejing");
        set.add("New York");

        System.out.println(set);
        for(String s:set)
            System.out.println(s+" ");
    }
}
