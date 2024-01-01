package com.company;

public class Test_Student_Class{
    public static void main(String[] args) {
        Student student = new Student(111223333, "John");
        java.util.Date dateCreated = student.getDateCreated();
        dateCreated.setTime(200000); // Now dateCreated field is changed!
        //cant say class or obj is immutable
    }
}
