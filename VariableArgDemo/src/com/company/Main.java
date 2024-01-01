package com.company;

public class Main {

    public static void main(String[] args) {
    printMax(34,3,3,2,56.5);
    printMax(new double[]{1,2,3});
    }

    private static void printMax(double... numbers){
        if(numbers.length==0){
            System.out.println("No arguement passed");
            return;
        }
        double result=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>result)
                result=numbers[i];
        }
        System.out.println("Max value is "+result);
    }
}
