package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Customer customer=new Customer("Tim",54.96);
//        Customer anotherCustomer=customer;
//        anotherCustomer.setBalance(12.18);
//        System.out.println(customer.getName()+" "+customer.getBalance());
//        System.out.println(anotherCustomer.getName()+" "+anotherCustomer.getBalance());

        ArrayList<Integer> intList=new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for(int x:intList)
            System.out.println(x);
        intList.addAll(intList);

        System.out.println("---------");
        intList.add(0,15);
        for(int x:intList)
            System.out.println(x);
    }
}
