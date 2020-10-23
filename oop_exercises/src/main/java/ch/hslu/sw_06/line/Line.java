package ch.hslu.sw_06.line;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    /**
     * Sets a new Point object as start of the line.
     * It's not recommended to use this method, because existing references to the start point of the line will not update! Use Line.moveStartTo() instead.
     * @param start New Point object representing the start of the line.
     */
    public void setStart(Point start) {
        this.start = start;
    }

    /**
     * Sets a new Point object as end of the line.
     * It's not recommended to use this method, because existing references to the end point of the line will not update! Use Line.moveEndTo() instead.
     * @param end New Point object representing the end of the line.
     */
    public void setEnd(Point end) {
        this.end = end;
    }

    public void moveStartTo(int x, int y){
        this.start.setX(x);
        this.start.setY(y);

        //I prefer to just set x & y values to the existing object, because otherwise existing references to the start point will not update!
        //this.start = new Point(x, y);
    }

    public void moveEndTo(int x, int y){
        this.end.setX(x);
        this.end.setY(y);

        //I prefer to just set x & y values to the existing object, because otherwise existing references to the end point will not update!
        //this.end = new Point(x, y);
    }

    /**
     * Moves a given point to the passed x and y position.
     * It's not recommended to use this method, because any Point object can be passed, including points which do not belong to this line!
     * @param point The point which will be moved.
     * @param x New x value of the point.
     * @param y New y value of the point.
     */
    public void movePointTo(Point point, int x, int y){
        point.setX(x);
        point.setY(y);
    }
}
