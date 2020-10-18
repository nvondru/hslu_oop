package ch.hslu.sw_03;

/**
 * Defines a point by an x and y value.
 * @author Nicolas Vondru
 * @version 1.0
 * @since 18.10.2020
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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
}
