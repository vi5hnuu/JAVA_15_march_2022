package com.example._static;

public class TestMethodsInCollectio {
    public static void main(String[] args) {
        java.util.Set<String> set1=new java.util.HashSet<>();
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Fransisco");
        set1.add("Bejing");

        System.out.println("Set1 is "+set1);
        System.out.println("Set1 size if "+set1.size());
        set1.remove("London");//no index remove in set..u know why ?
        System.out.println("\nSet1 is "+set1);
        System.out.println(set1.size()+" elemets in set1");

        java.util.Set<String> set2=new java.util.HashSet<>();
        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");
        System.out.println("\nset2 is " + set2);
        System.out.println(set2.size() + " elements in set2");

        System.out.println("\nset2 is "+set2);

        System.out.println("\nIs taipel in set "+set1.contains("Taipel"));

        set1.addAll(set2);
        System.out.println("After adding set2 to set1 , set1 is "+set1);
        set1.removeAll(set2);
        System.out.println("After removing set2 from set1, set1 is "+set1);

        set1.retainAll(set2);
        System.out.println("After retaining common elements in set2 "+" and set2, set1 is "+set1);
    }

}
