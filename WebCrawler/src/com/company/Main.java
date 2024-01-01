// Java Program to illustrate java.math.Context class

// Importing all classes from
// java.math package
package com.company;
import java.math.*;

// Main class
class Main {

    // Main driver method
    public static void main(String args[])
    {

        // Custom input number 'N' over which
        // class operation are performed
        // N = 246.8

        // erforming the rounding of operations

        // Rounding off is carried out across
        // 4 digits
        // N = 246.8
        // It has 4 digits only so
        // the output is same as input

        // Case 1
        // Across all digits of the input N = 4
        System.out.println(new BigDecimal("246.8", new MathContext(4, RoundingMode.HALF_UP)));
        // Case 2
        // Across 'N/2' of the input 'N'
        // Here, acrossings 2 digits as input N has 4 digits

        // Rounding HALF_UP
        System.out.println(new BigDecimal(
                "246.8",
                new MathContext(2, RoundingMode.HALF_UP)));

        // Rounding HALF_DOWN
        System.out.println(new BigDecimal(
                "246.8",
                new MathContext(2, RoundingMode.CEILING)));

        // Case 3
        // Across '1' digit of the input 'N'
        // Here, acrossings 2 digits of 4 digits of input N

        // Rounding HALF_UP
        System.out.println(new BigDecimal(
                "246.8",
                new MathContext(1, RoundingMode.HALF_UP)));

        // Rounding HALF_DOWN
        System.out.println(new BigDecimal(
                "246.8",
                new MathContext(1, RoundingMode.CEILING)));
    }
}
