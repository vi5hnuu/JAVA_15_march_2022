package com.company;

public class Main {

    public static void main(String[] args) {
//        Animal animal=new Animal("animal",1,1,5,5);
        Dog dog=new Dog("Yorkee",8,20,2,4,1,20,"long silky");
//        System.out.println(dog.getName());
//        dog.eat();
//        System.out.println("************");
//        dog.walk();


        /*It is not necessary, but it is highly recommended. It keeps you from shooting yourself in the foot.
         It helps prevent the case when you write a function that you think overrides another one but you misspelled
        something and you get completely unexpected behavior.*/
        dog.eat();
    }
}
