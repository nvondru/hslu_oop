package ch.hslu.sw_06.line;

/**
 * Defines a point by an x and y value.
 * @author Nicolas Vondru
 * @version 3.0
 * @since 23.10.2020
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point){
        this(point.getX(), point.getY());
    }

    /**
     * Calculates the quadrant in which the point is located.
     * @return Returns an int value between 0 and 4 representing the respective quadrant, where 0 means that the point lies on an axis or the origin.
     */
    public int getQuadrant(){
        if(this.x > 0 && this.y > 0){
            return 1;
        }else if(this.x < 0 && this.y > 0){
            return 2;
        }else if(this.x < 0 && this.y < 0){
            return 3;
        }else if(this.x > 0 && this.y < 0){
            return 4;
        }else{
            System.out.println("Point lies on an axis or origin.");
            return 0;
        }
    }

    public void moveRelative(int x, int y){
        this.x += x;
        this.y += y;
    }

    public void moveRelative(Point point){
        this.x += point.getX();
        this.y += point.getY();
    }

    // Although this function could technically be used to calculate new x and y coordinates, it's not recommended to declare it.
    // The reason is its ambiguity to "moveRelative(int, int)"
    public void moveRelative(double angle, double amount){
        throw new UnsupportedOperationException("This method is not implemented properly. It's declared for design purposes only.");
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
