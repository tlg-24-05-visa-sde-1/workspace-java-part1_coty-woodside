package com.hoops.test;

import com.hoops.BasketballPlayer;
import com.hoops.Position;

import static com.hoops.Position.PG;

class BasketballPlayerValidationTest {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please supply Name, Position, Height, and FG%.");
        }

        BasketballPlayer b1 = new BasketballPlayer();
        String name = args[0];
        String position = args[1];
        String pass = args[2];
        String fgString = args[3];

        if (b1.isValidPosition(position)) {
            System.out.println("Position is valid");
        } else {
            System.out.println("Position is not valid, please supply PG/SG/SF/PF/C.");
        }

        if (b1.isValidName(name)) {
            System.out.println("Name is valid");
        } else {
            System.out.println("Name is not valid");
        }

        BasketballPlayer b2 = new BasketballPlayer("Luka Doncic", Position.SG, 78, 49);
        if (b2.isValidName(name)) {
            System.out.println(name + "has been created");
        }
        if (b2.isValidPosition(position)) {
            System.out.println("Position: " + position);
        } else {
            System.out.println("Position is not valid, please supply PG/SG/SF/PF/C.");
        }
        if (b2.isValidName(pass)) {
            System.out.println("Pass Rating: " + pass);
        } else {
            System.out.println("Invalid Pass Rating");
        }

    }

    // I'm sorry, Jay.  I hope you will forgive me on this one!  I know it is messy. I tried it two ways.
    // I believe you were looking for the second example. I fumbled around with the first one for a bit.
    // I understand that my validation client should be a good place for testing inputs, but I wasn't sure
    // where those inputs were supposed to be supplied, and by th time I stopped worrying about that I had
    // lost my place creating the actual validations. Now everything shows up invalid when I run it.

}