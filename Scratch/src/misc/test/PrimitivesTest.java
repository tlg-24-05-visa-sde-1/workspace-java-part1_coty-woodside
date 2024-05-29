package misc.test;

class PrimitivesTest {

    public static void main(String[] args) {
        int age = 35;
        System.out.println("The age is:" +age);

        long population = 9_000_000_000L;
        System.out.println("The population is:" +population);

        double temp = 70.5;
        System.out.println("The temp:" +temp);

        boolean isCloudy = true;
        System.out.println("The isCloudy is:" +isCloudy);

        char grade = 'A';
        System.out.println("grade is: " + grade);

        String size = "L";
        System.out.println("size is: " + size);

        System.out.println();

        int x = 3;

        System.out.println("x is: " + ++x);

        int a = 5;
        int b = a;
        a++;
        System.out.println("b is: " + b);

    }
}