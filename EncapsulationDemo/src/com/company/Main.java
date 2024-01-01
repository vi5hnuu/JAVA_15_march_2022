//package com.company;
//
//public class Main {
//
//    public static void main(String[] args) {
//    Player player=new Player();
//        System.out.println(player);
//        System.out.println(player.toString());
//        player.fullname="Tim";
//        player.health=20;
//        player.weapon="Sword";
//        int damage=10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health "+player.healthRemaining());
//        player.loseHealth(damage);
//        System.out.println("Remaining health "+player.healthRemaining());
//        player.health=20;
//        System.out.println("Remaining health "+player.healthRemaining());
//    }
//}


//ans to best sol
package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player=new Player("Tim",20,"Sword");
        Player player=new Player();
        System.out.println(player);
        System.out.println(player.toString());
        int damage=10;
        player.loseHealth(damage);
        System.out.println("Remaining health "+player.healthRemaining());
        player.loseHealth(damage);
        System.out.println("Remaining health "+player.healthRemaining());
        System.out.println(player);
        System.out.println(player.toString());
    }
}
