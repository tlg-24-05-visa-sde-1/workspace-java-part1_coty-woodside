package org.math;
import static java.lang.Math.*;

// This is an "all-static" class, or one with nothing but static methods
// These methods are called from Clients as Calculator.add(), Calculator.subtract(), etc.
//

class Calculator {

    // Returns the average of the supplied integers
    //
    //

   public static double average(int first, int ... rest) {
       double result = 0.0;

       int sum = 0;
       for (int value : rest) {
           sum += value;
       }

       result = (1.0 * sum) / rest.length + 1;

       return result;

   }



   public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    // indicates if the supplied integer is even or not

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }


    // returns a random integer between 'min" and 'max' (inclusive)

    public static int randomInt(int min, int max){
       int result = 0;

       double rand  = random();               // 0.0000 to 0.9999
       double scaled = (rand * (max - min + 1)) + min;    //0
        result = (int) scaled;

       return result;
    }

    //convenience method to return a random integer between 1 and max
    public static int randomInt (int max) {
       return randomInt (1, max);
    }

     //Returns a random integer between 1 and 16 (inclusive).

    public static int randomInt(){
        return randomInt(1, 16);  // calling random int from above


        double result = Calculator.average(3, 5, 10, 13);
        System.out.println("The average is: " + avg);
    }

    public static double average() {
       return average(3, 5, 10, 13);
    }
}