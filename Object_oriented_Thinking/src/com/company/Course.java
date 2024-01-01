package com.company;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    Course(String courseName){
        this.courseName=courseName;
        students=new String[100];
    }

    String getCourseName(){
        return courseName;
    }
    void addStudent(String student){
        students[numberOfStudents++]=student;
    }
    void dropStudent(String name){
       for(int i=0;i<numberOfStudents;i++){
           if(students[i].equals(name)){
               int j=-1;
               for(j=i;j<numberOfStudents-1;j++)
                   students[j]=students[j+1];
               if(j>0)
               students[j]=null;
           numberOfStudents--;
           return;
           }
       }
        System.out.println("No such student exist");
    }
    String[] getStudents(){
        return students;
    }
    int getNumberOfStudents(){
        return numberOfStudents;
    }
}
