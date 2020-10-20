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

    @Override
    public void changeDimensions(double width, double height){
        throw new UnsupportedOperationException("Calling this method is not allowed, beacuse it's overriden.");
    }

    public void changeDimensions(double side) {
        super.changeDimensions(side, side);
    }
}
