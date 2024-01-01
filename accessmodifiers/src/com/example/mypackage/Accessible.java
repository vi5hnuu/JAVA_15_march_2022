package com.example.mypackage;

interface Accessible { //package-private
    int SOME_CONSTANT=100; //default public static final
    public void methodA();
    void methodB();
    boolean methodC();
}
