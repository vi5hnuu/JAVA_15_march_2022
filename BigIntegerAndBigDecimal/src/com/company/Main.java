package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
//        BigInteger a=new BigInteger("123456789123");
//        BigInteger b=new BigInteger("2");
//        BigInteger c=a.multiply(b);
//        System.out.println(c);

//        BigDecimal a=new BigDecimal("1.0");
//        BigDecimal b=BigDecimal.valueOf(1.0);
//        BigDecimal c=a.multiply(b);
//        System.out.println(c);

        BigDecimal a=new BigDecimal("1.0");
        BigDecimal b=new BigDecimal("3");
        BigDecimal c=a.divide(b,20, RoundingMode.HALF_UP);
        System.out.println(c);
    }
}
