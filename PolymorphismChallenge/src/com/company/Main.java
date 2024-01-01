package com.company;

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    public Car(int cylinders,String name){
        this.cylinders=cylinders;
        this.name=name;
        this.wheels=4;
        this.engine=true;
    }
    public String getName(){
        return name;
    }
    public int getCylinders(){
        return cylinders;
    }
    public String startEngine(){
        return "Car -> startEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders,String name){
        super(cylinders,name);
    }
    @Override
    public String startEngine(){
        return "Mitsubishi -> startEngine()";
    }
    @Override
    public String accelerate(){
        return "Mitsubishi -> accelerate()";
    }
    @Override
    public String brake(){
//        return "Mitsubishi -> brake()";
//        return  getClass().getName() +"-> brake()";
        return  getClass().getSimpleName() +"-> brake()";
    }
}
//class Ford extends Car{
//    public Ford(int cylinders,String name){
//        super(cylinders,name);
//    }
//    @Override
//    public String startEngine(){
//        return "Ford -> startEngine()";
//    }
//    @Override
//    public String accelerate(){
//        return "Ford -> accelerate()";
//    }
//    @Override
//    public String brake(){
//        return "Ford -> brake()";
//    }
//}


public class Main {

    public static void main(String[] args) {
	Car car=new Car(8,"Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car car1=new Mitsubishi(8,"Mitsubishi car");
//        Mitsubishi car1=new Mitsubishi(8,"Base car");
        System.out.println(car1.startEngine());
        System.out.println(car1.accelerate());
        System.out.println(car1.brake());

//        Car car2=new Ford(8,"Ford car");
//        System.out.println(car2.startEngine());
//        System.out.println(car2.accelerate());
//        System.out.println(car2.brake());

        Car car2=new Car/*extends Car*/(8,"Ford car"){ //Ford calss ctor
            @Override
            public String startEngine(){
                return "Ford -> startEngine()";
                     }
            @Override
            public String accelerate(){
                 return "Ford -> accelerate()";
            }
            @Override
            public String brake(){
                return "Ford -> brake()";
                     }
        }   ;
        System.out.println(car2.startEngine());
        System.out.println(car2.accelerate());
        System.out.println(car2.brake());

    }
}
