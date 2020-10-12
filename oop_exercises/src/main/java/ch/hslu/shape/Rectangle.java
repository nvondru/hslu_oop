package ch.hslu.shape;

public final class Rectangle extends Shape {

    private double width;
    private double height;

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
