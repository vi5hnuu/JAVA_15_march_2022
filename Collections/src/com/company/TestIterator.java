package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

public class TestIterator {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Medison");

        Iterator<String> iterator=collection.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next().toUpperCase()+" ");
        System.out.println();
    }

}
