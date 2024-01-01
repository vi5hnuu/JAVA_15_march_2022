package com.company;

import java.math.BigInteger;

public class Factorial {
    private int num;
    Factorial(int num){
        this.num=num;
    }
    public BigInteger calculateFactorialOf(){
        BigInteger temp=BigInteger.ONE; //BigInteger.valueof(1);
        while(num!=0){
            temp=temp.multiply(BigInteger.valueOf(num--));
        }
        return temp;
    }
}
