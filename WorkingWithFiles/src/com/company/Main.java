package com.company;

public class Main {

    public static void main(String[] args) {
	java.io.File file=new java.io.File("D:\\JAVA_UDEMY\\WorkingWithFiles\\images"); //bad style
        System.out.println("Does it exists :"+file.exists());
        System.out.println("The file has "+file.length()+" bytes");
        System.out.println("Can we read it :"+file.canRead());
        System.out.println("Can we write it :"+file.canWrite());
        System.out.println("Is a directory :"+file.isDirectory());
        System.out.println("Is a file :"+file.isFile());
        System.out.println("Is a hidden :"+file.isHidden());
        System.out.println("Is a absolute :"+file.isAbsolute());
        System.out.println("absolute path is :"+file.getAbsolutePath());
        System.out.println("lastModifies :"+ new java.util.Date(file.lastModified()));
        System.out.println("name  :"+file.getName());
        System.out.println("parent :"+file.getParent());
    }
}
