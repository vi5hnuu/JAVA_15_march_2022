package com.example._static;

import java.util.*;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New york");
        set.add("San Fransisco");
        set.add("Bejing");
        set.add("New  York");
        System.out.println(set);

        for(String s:set)
            System.out.println(s.toUpperCase()+" ");

        System.out.println();
        set.forEach(e-> System.out.println(e.toUpperCase()+" "));
    }
}
