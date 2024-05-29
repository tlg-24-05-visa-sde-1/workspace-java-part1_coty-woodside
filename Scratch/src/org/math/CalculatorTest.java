package org.math;

class CalculatorTest {
    public static void main(String[] args) {
        boolean isCorrect = true;
        // call Calculator.randomInt(5, 20) 1 million times
        // if it ever comes back < 5 or > 20, it doesn't work right
        for (int i = 0; i < 10_000_000; i++) {
            int result = Calculator.randomInt(5, 20);
            if (result < 5 || result > 20) {
                isCorrect = false;
                break;
            }

        }


        if (isCorrect){
            System.out.println("It works!!");
        }
        else {
            System.out.println("Its broken!!");
        }
    }
}