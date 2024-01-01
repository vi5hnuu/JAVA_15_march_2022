package com.example._static;

import java.util.*;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("Beijing");
        set.add("New York");
        TreeSet<String> treeSet=new TreeSet<>(set);
        System.out.println("Sorted tree set : "+treeSet);

        System.out.println("first(): "+treeSet.first());
        System.out.println("last(): "+treeSet.last());
        System.out.println("headset(\"New York\") :"+treeSet.headSet("New York"));
        System.out.println("tailSet(\"New York\") :"+treeSet.tailSet("New York"));
        System.out.println("lower(\"p\") :"+treeSet.lower("P"));
        System.out.println("higher(\"p\") :"+treeSet.higher("P"));
        System.out.println("floor(\"p\") :"+treeSet.floor("P"));
        System.out.println("ceiling(\"p\") :"+treeSet.ceiling("P"));
        System.out.println("pollFirst() :"+treeSet.pollFirst());
        System.out.println("pollLast() :"+treeSet.pollLast());
        System.out.println("New tree set "+treeSet);
    }
}
