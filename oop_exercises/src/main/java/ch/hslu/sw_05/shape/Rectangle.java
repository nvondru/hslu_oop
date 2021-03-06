package ch.hslu.sw_05.shape;

/**
 * Specialized shape object, implementing additional specialized logic for a Rectangle object.
 * @author Nicolas Vondru
 * @version 1.0
 * @since 13.10.2020
 */
public class Rectangle extends Shape {

    private double width;
    private double height;

    /**
     * Initializes a square Rectangle object with a single side length on a given x/y position.
     * @param x Position on the x axis.
     * @param y Position on the y axis.
     * @param side Length of one side, will be set as width and height of the general Rectangle object.
     * @see ch.hslu.sw_05.shape.Square
     */
    public Rectangle(int x, int y, double side) {
        super(x, y);
        this.width = side;
        this.height = side;
    }

    /**
     * Initializes a Rectangle object with a width and height on a given x/y position.
     * @param x Position on the x axis.
     * @param y Position on the y axis.
     * @param width Width of the Rectangle object.
     * @param height Height of the Rectangle object.
     */
    public Rectangle(int x, int y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public void changeDimensions(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}
