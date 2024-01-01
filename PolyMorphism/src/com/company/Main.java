package com.company;

//class Movie{
//    private String name;
//    public Movie(String name){
//        this.name=name;
//    }
//    public String plot(){
//        return "No plot here";
//    }
//}

abstract class Movie{
    private String name;
    public Movie(String name){
        this.name=name;
    }
    abstract public String plot();
}

class jaws extends Movie{
    public jaws(){
        super("Jaws");
    }
    @Override
    public String plot(){
        return "A shark eats lots of people";
    }
}
class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }
    @Override
    public String plot(){
        return "Aliens to take over planet earth";
    }
}
class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }
    @Override
    public String plot(){
        return "Kids try and escape a maze";
    }
}
class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }
    @Override
    public String plot(){
        return "Imperial forces try to take over universe";
    }
}

//class Forgetable extends Movie{
//    public Forgetable(){
//        super("Forgetable");
//    }
//}
class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }
    @Override
    public String plot(){
        return "forgetable-abstractclass";
    }
}



public class Main {

    public static void main(String[] args) {
//    Movie a=new Movie("No name");
//        System.out.println(a.plot());
        Movie a;
        a=new Forgetable();
        System.out.println(a.plot());
        a=new IndependenceDay();
        System.out.println(a.plot());
        a=new jaws();
        System.out.println(a.plot());
        a=new MazeRunner();
        System.out.println(a.plot());
        a=new StarWars();
        System.out.println(a.plot());
    }
}


//remember binding happen at runtime
//in basic class(non abstract) if there were no plot method and let say all
//inherited class have plot method then we cannot say a.plot() for any subclass
//as at complie time "a" is object of movie and movie do not have plot
//in case of its just we cannot make object of movie class..also we make ssure that plot shoud be overridden by every subclass
//like Number class is abstract in java thatswhy every class derived from number has intValue,doubleValue etc