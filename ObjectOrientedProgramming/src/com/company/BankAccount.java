//package com.company;
//
//public class BankAccount {
//    private String accountNumber,customerName,email,phoneNumber;
//    private double balance;
//
//    public BankAccount(String accountNumber, String customerName, String email, String phoneNumber, double balance) {
//        System.out.println("Five agr ctor called.");
//        this.accountNumber = accountNumber;
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//        this.balance = balance;
//    }
//    public BankAccount(){
//        System.out.println("Zero agr ctor called.");
//        this.accountNumber = "NULL";
//        this.customerName = "NULL";
//        this.email = "NULL";
//        this.phoneNumber = "NULL";
//        this.balance = 0.0;
//    }
//
//    public void setAccountNumber(String accountNumber){
//        this.accountNumber=accountNumber;
//    }
//    public void setCustomerName(String customerName){
//        this.customerName=customerName;
//    }
//    public void setEmail(String email){
//        this.email=email;
//    }
//    public void setPhoneNumber(String phoneNumber){
//        this.phoneNumber=phoneNumber;
//    }
//    public void setBalance(double balance){
//        this.balance=balance;
//    }
//
//    public String getAccountNumber(){
//        return this.accountNumber;
//    }
//    public String getCustomerName(){
//        return this.customerName;
//    }
//    public String getEmail(){
//        return this.email;
//    }
//    public String getPhoneNumber(){
//        return this.phoneNumber;
//    }
//    public double getBalance(){
//        return this.balance;
//    }
//
//    public void deposit(double fund){
//        if(fund>0){
//        this.balance+=fund;
//            System.out.println("Deposit successfull\n"+
//                    "clr balance :"+balance);
//        }
//        else
//            System.out.println("Invalid amount.");
//    }
//    public void withdraw(double fund){
//        if(fund>0 && balance>=fund){
//            this.balance-=fund;
//            System.out.println(fund+" withdrawn succesfully"+
//                    "Clr balance :"+(this.balance));
//        }
//        else
//            System.out.println("Insufficient balance in account.\n"+
//                    "Clr balance :"+this.balance);
//    }
//
//}


//better class


package com.company;

public class BankAccount {
    private String accountNumber,customerName,email,phoneNumber;
    private double balance;

//    public BankAccount(String accountNumber="NULL", String customerName="NULL", String email="NULL", String phoneNumber="NULL", double balance=0.0) {
    //instead we call 5arg ctor from zero arg for default values
    public BankAccount(String accountNumber, String customerName, String email, String phoneNumber, double balance) {
        System.out.println("Five agr ctor called.");
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
//        this.balance=balance;
        setBalance(balance); //now it will apply condition of functions as well..(Bad way)
    }

    public BankAccount(String email, String phoneNumber, double balance) {
        this("9999","xyz",email,phoneNumber,balance);
    }

    public BankAccount(){
        this("NULL","NULL","NULL","NULL",0.0);
        System.out.println("(this() must be first statement in zero ag ctor)\nZero arg ctor called after five arg ctor");

    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void setBalance(double balance){
        if(balance>=0){
            this.balance=balance;
        }
        else{
            System.out.println("Invalid amount\nsetting balance to 0.0 :");
        }

    }

    public String getAccountNumber(){
        return this.accountNumber;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public double getBalance(){
        return this.balance;
    }

    public void deposit(double fund){
        if(fund>0){
            this.balance+=fund;
            System.out.println("Deposit successfull\n"+
                    "clr balance :"+balance);
        }
        else
            System.out.println("Invalid amount.");
    }
    public void withdraw(double fund){
        if(fund>0 && balance>=fund){
            this.balance-=fund;
            System.out.println(fund+" withdrawn succesfully\n"+
                    "Clr balance :"+(this.balance));
        }
        else
            System.out.println("Insufficient balance in account.\n"+
                    "Clr balance :"+this.balance);
    }

}
