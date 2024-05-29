package com.hoops;

public class BasketballPlayer {
    private String name;
    private Position position;
    private int pass;  // denotes their passing ability
    private int FG;   //denotes FG%


    public BasketballPlayer() {
    }

    //Constructor
    public BasketballPlayer(String name, Position position, int pass, int FG) {
        this.name = name;
        this.position = position;
        this.pass = pass;
        this.FG = FG;
    }

    //Methods
    public void pass() {
        int random = (int) (Math.random() * 100);
        if (random < pass) {
            System.out.println(name + " passes the ball.");
        } else {
            System.out.println(name + " turns the ball over.");
        }

    }

    public void dribble() {
        System.out.println(name + " dribbles the ball.");
    }

    public void shoot() {
        int random = (int) (Math.random() * 100);      //generate random number vs FG to simulate FG percentage
        if (random < FG) {
            System.out.println(name + " scores the ball."); // should make the ball according to his FG
        } else {
            System.out.println(name + " misses the shot.");
        }
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public Position setPosition(String arg) {
        return position;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getFG() {
        return FG;
    }

    public void setFG(int FG) {
        this.FG = FG;
    }

    public boolean isValidPosition(String position) {
        return false;
    }

    public boolean isValidName(String name) {
        return false;
    }
}