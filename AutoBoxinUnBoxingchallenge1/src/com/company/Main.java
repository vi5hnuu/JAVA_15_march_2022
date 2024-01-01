package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Nationa Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.02);
        bank.addCustomer("Adelaide", "vishnu", 99);
        bank.addCustomer("Adelaide", "krishan", 99.50);

        bank.addBranch("Baroda");
        boolean x = bank.addCustomer("Baroda", "Bob", 150.54);
        if (x)
            System.out.println("added");
        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "vishnu", 44.22);
        bank.addCustomerTransaction("Adelaide", "krishan", 44.22);
//    bank.listCustomers("Adelaide",false);
        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Baroda", true);
    }
}
