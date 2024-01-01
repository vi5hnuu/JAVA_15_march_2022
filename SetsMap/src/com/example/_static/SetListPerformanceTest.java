package com.example._static;

import java.util.*;

public class SetListPerformanceTest {
    static  final int N=50000;

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<N;i++)
            list.add(i);
        Collections.shuffle(list);

        Collection<Integer> set1=new HashSet<>(list);
        System.out.println("Memebr test time for hasSet is "+getTestTime(set1)+" ms");
        System.out.println("Remove element time for hash set is "+getRemoveTime(set1)+" ms");

        Collection<Integer> set2=new LinkedHashSet<>(list);
        System.out.println("Memebr test time for LinkedHashSet is "+getTestTime(set2)+" ms");
        System.out.println("Remove element time for LinkedhashSet is "+getRemoveTime(set2)+" ms");

        Collection<Integer> set3=new TreeSet<>(list);
        System.out.println("Memebr test time for TreeSet is "+getTestTime(set3)+" ms");
        System.out.println("Remove element time for TreeSet is "+getRemoveTime(set3)+" ms");

        Collection<Integer> set4=new ArrayList<>(list);
        System.out.println("Memebr test time for ArrayList is "+getTestTime(set4)+" ms");
        System.out.println("Remove element time for ArrayList is "+getRemoveTime(set4)+" ms");

        Collection<Integer> set5=new LinkedList<>(list);
        System.out.println("Memebr test time for LinkedList is "+getTestTime(set5)+" ms");
        System.out.println("Remove element time for LinkedList is "+getRemoveTime(set5)+" ms");
    }

    public static long getTestTime(Collection<?> c){
        long startTime=System.currentTimeMillis();
        for(int i=0;i<N;i++)
            c.contains((int)(Math.random()*2*N));
        return System.currentTimeMillis()-startTime;
    }

    public static long getRemoveTime(Collection<Integer> c){
        long startTime=System.currentTimeMillis();

        for(int i=0;i<N;i++)
            c.remove(i);

        return System.currentTimeMillis()-startTime;
    }
}
