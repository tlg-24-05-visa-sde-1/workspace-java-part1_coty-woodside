package org.math;
import static org.math.Calculator.*;

class CalculatorClient {
    public static void main(String[] args) {

        double sum = add(1.5, 4.5);
        System.out.println("sum is: " + sum);

        System.out.println("difference is: " + subtract(1, 4));

        boolean result = isEven(9);
        System.out.println("result is: " + result);

        int winner = randomInt(5, 20);
        System.out.println("The winner is: " + winner);

        double avg = Calculator.average();
        System.out.println("The average is: " + avg);
    }
}