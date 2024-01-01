package com.example;

import javax.accessibility.Accessible;

public class Checkaccessibility {
    public static void main(String[] args) {
        System.out.println(Accessible.SOME_CONSTANT);//Accessible is package private so its constant
        // varible is not accessible though its variable is public
    }

}
