package com.company;

//in unchecked exception we dont have to use throws->we can directly throw the exception but in checked we either handle it or "throws" it(as check exception are exxamined by compiler at compile time)
//and uncheck are not examined at compile time


public class Exception_throw_throws {
    public static void main(String[] args) {
        Student st1=null;
        Student st2=null;
        try {
            st1=new Student("ganga",25);
            System.out.println("created st1 "+st1);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

        try {
            st2=new Student("Yamuna",1003);
            System.out.println("Created st2 "+st2);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}

class Student{
    private String name;
    private int age;
    public Student(String name,int age) throws  InvalidAgeException{//checked exception as it is not subclass of RuntimeExceptionclass or Error class
        this.name=name;
        setAge(age);
    }
    public void setAge(int age) throws InvalidAgeException{
        if(age<0 || age>999){throw new InvalidAgeException("age error");}
        this.age=age;
    }
    @Override
    public String toString(){
        return "name = "+name+", age = "+age;
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String errorMesage){
        super(errorMesage);
    }
}


