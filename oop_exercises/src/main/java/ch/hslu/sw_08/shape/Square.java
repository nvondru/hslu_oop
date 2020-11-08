package ch.hslu.sw_08.shape;

/**
 * Specialized Rectangle Object, simplifying logic for calculations.
 * @author Nicolas Vondru
 * @version 1.0
 * @since 13.10.2020
 */
public final class Square extends Shape {

    private double side;

    public Square(final int x, final int y, final double side){
        super(x, y);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(final double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }
}
