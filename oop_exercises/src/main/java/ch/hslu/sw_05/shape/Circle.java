package ch.hslu.sw_05.shape;

/**
 * Specialized shape object, implementing additional specialized logic for a Circle object.
 * @author Nicolas Vondru
 * @version 1.0
 * @since 13.10.2020
 */
public final class Circle extends Shape {

    private double diameter;

    /**
     * Initializes a Circle object with a diameter on a given x/y position.
     * @param x Position on the x axis.
     * @param y Position on the y axis.
     * @param diameter Diameter of the Circle object (equals 2x its radius).
     */
    public Circle(int x, int y, double diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }


    @Override
    public double getPerimeter() {
        return Math.PI * this.diameter;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow((this.diameter / 2), 2);
    }
}
