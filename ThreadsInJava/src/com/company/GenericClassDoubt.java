package com.company;

import java.util.ArrayList;

public class GenericClassDoubt {
    public static void main(String[] args) {
        //when we do not pass the arguement to generic they will became Object type automatical..remmembwe <E>===> <E extends Object>
        ArrayList a=new ArrayList();
        a.add(5);
        System.out.println( a.get(0)); //Object->Integer // ans.toString() of Integer class
        System.out.println((Integer) a.get(0));
    }
}
