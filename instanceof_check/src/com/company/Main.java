package com.company;

public class Main {

    public static void main(String[] args) {
        String name1 = "Ganga";
        String name2 = "Amazon";

        boolean statement1 = name1 instanceof String;

        //boolean statement2 = name2 instanceof name1;

        boolean statement3 = name1 instanceof Object;

        boolean statement4 = args instanceof Object;

        boolean statement5 = args instanceof String[];
        //boolean statement5 = args instanceof String;
        System.out.println(statement1);
        System.out.println(statement3);
        System.out.println(statement4);
        System.out.println(statement5);
        //float x=5+5.0;
        System.out.println(Math.round(2.55635));
    }
}
