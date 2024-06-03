package edu.geometry;

public class Triangle implements Shape {

    private final double sideA;
    private final double sideB;
    private final double angleC;

    public Triangle(double sideA, double sideB, double angleC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angleC = angleC;   // angle must be in radians
    }

    public double getArea() {
        return 0.5 * sideA * sideB * Math.sin(angleC);
    }

    public double getSideA(){
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getAngleC() {
        return angleC;
    }
}
