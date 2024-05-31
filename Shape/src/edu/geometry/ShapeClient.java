package edu.geometry;

import edu.geometry.*;

public class ShapeClient {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(5),
                new Rectangle(3, 4),
                new Triangle(3, 4, Math.toRadians(90)),
        };

        double totalArea = 0;
        for (Shape shape : shapes) {
            double area = shape.getArea();
            totalArea += area;
        }
        System.out.println("Total area: " + totalArea);
    }
}
