package ch.hslu.sw_05;


import ch.hslu.sw_05.shape.Circle;
import ch.hslu.sw_05.shape.Rectangle;
import ch.hslu.sw_05.shape.Square;

public class Main {
    public static void main(String[] args) {
        Circle circle  = new Circle(10, 20, 10);
        Rectangle rectangle = new Rectangle(0, 0, 20, 50);
        Square square = new Square(20, 20, 40);

        System.out.println("Circle");
        System.out.println("X: " + circle.getX() + " / Y: " + circle.getY());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());

        System.out.println("Rectangle");
        System.out.println("X: " + rectangle.getX() + " / Y: " + rectangle.getY());
        System.out.println("Width: " + rectangle.getWidth() + " / Height: " + rectangle.getHeight());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());

        System.out.println("Square");
        System.out.println("X: " + square.getX() + " / Y: " + square.getY());
        System.out.println("Width: " + square.getWidth() + " / Height: " + square.getHeight());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Area: " + square.getArea());

    }
}
