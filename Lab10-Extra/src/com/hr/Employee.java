package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    //


    //Option 4: try-catch and throw a different exception, working exception


    public void goToWork() throws WorkException {
        Car c = new Car("ABC123", "Ford", "Focus");

        try {
            c.start();
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
           // insert this exception into a new WorkException and throw that
            throw new WorkException("Unable to get to work", e);
        }
        finally {
            c.stop();
        }
    }

    //Option 3: try-catch, react in some way, and then re-throw it back at client

   /* public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("ABC123", "Ford", "Focus");

        try {
            c.start();
            c.moveTo("Tacoma");
        }
        catch (DestinationUnreachableException e) {
            System.out.println("email Lisa to complain");
            throw e;
        }
        finally {
            c.stop();
        }
    }
*/


    //  Option 2: punt - dont catch exception - ignore it

  /*  public void goToWork() throws DestinationUnreachableException {
        // create an instance of Car with all three properties: vin, make, model
        Car c = new Car("ABC123", "Ford", "Focus");

        try {
            c.start();
            c.moveTo("West Seattle");
        }
        finally {
            c.stop();
        }
       }
  */


    // Option 1: Handle it

//    public void goToWork() {
//        // create an instance of Car with all three properties: vin, make, model
//        Car c = new Car("ABC123", "Ford", "Focus");
//
//        try {
//            c.start();
//            c.moveTo("West Seattle");
//        } catch (DestinationUnreachableException e) {
//            System.out.println(e.getMessage());   //toString() automatically called
//        } finally {
//            c.stop();
//        }
//    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}