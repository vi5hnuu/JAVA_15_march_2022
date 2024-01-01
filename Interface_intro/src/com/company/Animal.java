package com.company;

public abstract class Animal {
    private double weight;

    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public abstract String sound();
}

class Chicken extends Animal implements Edible{
    @Override
    public String howtoEat(){ //like abstract class in interface also we have to Override or we get an error
        return "Chicken: Fry it";
    }
    @Override
    public String sound(){
        return "chicken: cock-a-doodle-do";
    }
}

class Tiger extends Animal{
    @Override
    public String sound(){
        return "Tiger: RROOAARR";
    }
}
abstract class Fruit implements Edible{

}

class Apple extends Fruit{
    @Override
    public String howtoEat(){
        return "Apple: Make apple cider";
    }
}
class orange extends Fruit{
    @Override
    public String howtoEat(){
        return "Orange: make orange juice";
    }
}

