package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "mohsin";
//        player.health = 20;
//        player.weapon = "gun";
//
//        int damage = 15;
//        player.loseHealth(damage);
//        System.out.println("the remaining health is " + player.healthRemaining());
//
//         damage =21;
//         player.health = 25;
//        player.loseHealth(damage);
//        System.out.println("the remaining health is " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("mohsin",200,"gun");
        System.out.println("the health is " + player.getHitpoint());
    }
}
