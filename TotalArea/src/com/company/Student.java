package com.company;



public class Student {
    private int id;
    private String name;
    private java.util.Date dateCreated;

    public Student(int ssn,String newname){
        id=ssn;
        name=newname;
        dateCreated=new java.util.Date();
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
}
