package ch.hslu.sw_05.shape;

/**
 * An abstract shape class that implements generalized logic for shape objects, such as Circle or Rectangle.
 * @author Nicolas Vondru (nicolas.vondru@stud.hslu.ch)
 * @version 1.0
 * @since 13.10.2020
 */

public abstract class Shape {
    private int x;
    private int y;

    /**
     * Initializes any shape object with an initial x and y coordinate.
     * @param x Position on the x axis.
     * @param y Position on the y axis.
     */
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Moves an object to the specified position on the x and y axis.
     * @param x Position on the x axis.
     * @param y Position on the y axis.
     */
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * Calculates and returns the perimeter of the specialized shape object.
     * @return Perimeter of the shape object as double.
     */
    public abstract double getPerimeter();
    /**
     * Calculates and returns the area of the specialized shape object.
     * @return Area of the shape object as double.
     */
    public abstract double getArea();

}
