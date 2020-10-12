package ch.hslu;

import ch.hslu.shape.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle  = new Circle(10, 20, 10);

        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

    }
}
