package ch.hslu.shape;

public final class Circle extends Shape {

    private double diameter;

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
