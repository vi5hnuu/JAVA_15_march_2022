//package com.company;
//
//public class Player {
//    public String fullname; //as it is public changes here will cause error in main if this field is manipulated there..
//    //so use private fields so that change in private field does not affect the working of main programm as private method will handle changes in fields of class
//    public int health;
//    public String weapon;
//
//    public void loseHealth(int damage){
//        this.health-=damage;
//        if(this.health<=0)
//            System.out.println("player knocked out");
//    }
//    public int healthRemaining(){
//        return this.health;
//    }
//}


//best solution
package com.company;

public class Player { //class can be pubic or default only
    private String fullName; //now u can change spelling or anthing
//    private int health=100;
    private int health;
    private String weapon;

    public Player(){}
    public Player(String fullName,int health,String weapon){ //can also be protected if dont want to access in outer package(so outer package can acces via inheritance only)
        this.fullName=fullName;
        this.health=health;
        this.weapon=weapon;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health-=damage;
        if(this.health<=0)
            System.out.println("player knocked out");
    }
    public int healthRemaining(){
        return this.health;
    }
    @Override
    public String toString(){
        return "Name "+fullName+"\nHealth "+health;
    }
}
