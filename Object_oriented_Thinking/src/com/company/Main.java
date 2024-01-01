package com.company;

public class Main {

    public static void main(String[] args) {
        Course course1=new Course("Data structures");
        Course course2=new Course("Database System");

        course1.addStudent("Vishnu kumar");
        course1.addStudent("Krishan kumar");
        course1.addStudent("Laxmi kumari");

        course2.addStudent("Ashish jaiswal");
        course2.addStudent("chandrasheel prasad");

        System.out.println("Number of students in course-1 :::"+course1.getNumberOfStudents());
        String[] students=course1.getStudents();
//        for(String name:students)
//            System.out.println(name);
        for(int i=0;i<course1.getNumberOfStudents();i++)
            System.out.println(students[i]);
            System.out.println("------------------------");
        System.out.println("Number of students in course-2 :::"+course2.getNumberOfStudents());
//        students=course2.getStudents();
//        for(String name:students)
        //    System.out.println(name);
        students=course2.getStudents();
        for(int i=0;i<course2.getNumberOfStudents();i++)
            System.out.println(students[i]);
        System.out.println("------------------------");
//        course2.dropStudent("chandrashel prasad");
//        course2.dropStudent("chandrasheel prasad");
        course2.dropStudent("Ashish jaiswal");
        students=course2.getStudents();
        for(int i=0;i<course2.getNumberOfStudents();i++)
            System.out.println(students[i]);
    }
}
