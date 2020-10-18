package ch.hslu.sw_05.shape;

/**
 * Specialized Rectangle Object, simplifying logic for calculations.
 * @author Nicolas Vondru
 * @version 1.0
 * @since 13.10.2020
 */
public class Square extends Rectangle {

    public Square(int x, int y, double side) {
        super(x, y, side);
    }

    public void changeDimensions(double side) {
        super.changeDimensions(side, side);
    }

    @Override
    public double getPerimeter() {
        //for a square each side is equal in length to either width or height
        double side = this.getWidth();
        return 4 * side;
    }

    @Override
    public double getArea() {
        //for a square each side is equal in length to either width or height
        double side = this.getWidth();
        return Math.pow(side, 2);
    }
}
