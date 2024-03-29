package com.company;

public class ComplexNumber {
    private double real,imaginary;

    public ComplexNumber(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public void add(double real,double imaginary){
        this.real+=real;
        this.imaginary+=imaginary;
    }
    public void add(ComplexNumber obj){
        this.real+=obj.real;
        this.imaginary+=obj.imaginary;
    }
    public void subtract(double real,double imaginary){
        this.real-=real;
        this.imaginary-=imaginary;
    }
    public void subtract(ComplexNumber obj){
        this.real-=obj.real;
        this.imaginary-=obj.imaginary;
    }
}
