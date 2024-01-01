package com.company;

public class InterfaceProblem {
    public static void main(String[] args) {
        Teacher t=new Teacher();
    }
}


interface Citizen {
    String getNationality();
}
interface Person {
    public static final int RETIREMENT_AGE = 60;
//    static void m(){ //replace static with default //make sure you know difference between default and static...
//        System.out.println("");
//    }
    void setName(String name);  // only method signature without method body
    String getName();
//    private int a(){return 5;}//if this method happens to be private it should hae a body {internal use};
    void setAge(int age);
    int getAge();
}
class Teacher implements Person, Citizen {  // statement 1
    private String name;
    private int age;
    private String nationality;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) { //we cannot change modifier public to private..
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getNationality() {
        return nationality;
    }
}