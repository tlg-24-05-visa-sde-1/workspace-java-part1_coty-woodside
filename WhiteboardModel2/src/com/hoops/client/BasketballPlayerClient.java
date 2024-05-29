package com.hoops.client;

import com.hoops.BasketballPlayer;
import com.hoops.Position;

class BasketballPlayerClient {
    public static void main(String[] args) {

        BasketballPlayer b1 = new BasketballPlayer("Kyrie Irving", Position.PG, 74, 47);

        BasketballPlayer b2 = new BasketballPlayer("Luka Doncic", Position.SG, 78, 49);


        System.out.println(b1.getName() + " passes the rock to " + b2.getName());
        b1.pass();

        System.out.println(b2.getName() + " shoots the ball ");
        b2.shoot();

    }
}

// If you run this multiple times, you should see that about 1/4 of the time, Kyrie turns the ball over
// and Luka should only make 1/2 shots.  I was hoping to string these two methods together so that if/when
// Kyrie turns the ball over, the "shoot" command no longer pops up, because Luka can't shoot the ball if it
// was turned over.

// Another note I have - I'm coming around now, but I struggled a bit to manage all the various clients and
// their purpose -Main Client vs Validation client, vs args client.  You will notice my args are probably showing
// in too many places.  I welcome any criticism and tips on this front!