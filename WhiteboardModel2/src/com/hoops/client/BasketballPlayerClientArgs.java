package com.hoops.client;

import com.hoops.BasketballPlayer;
import com.hoops.Position;

class BasketballPlayerClientArgs {
    public static void main(String[] args) {

        BasketballPlayer b1 = new BasketballPlayer("Kyrie Irving", Position.PG, 74, 47);

        if (args.length != 4) {
            System.out.println("Invalid number of arguments.");
            return;
        }

        String name = args[0];
        Position position = Position.valueOf(args[1].toUpperCase());
        int height = Integer.parseInt(args[2]);
        int FG = Integer.parseInt(args[3]);

        BasketballPlayer b2 = new BasketballPlayer(name, position, height, FG);

        System.out.println(b1.getName() + " passes the rock to " + b2.getName());

        System.out.println(b2.getName() + " shoots the ball ");
        b2.shoot();

    }

}