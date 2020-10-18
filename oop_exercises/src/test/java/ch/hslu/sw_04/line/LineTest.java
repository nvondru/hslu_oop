package ch.hslu.sw_04.line;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    public void testPointReferenceUpdate(){
        Point initialStart = new Point(0, 0);
        Point initialEnd = new Point(10, 10);

        Line line = new Line(initialStart, initialEnd);
        assertEquals(0, line.getStart().getX());
        assertEquals(0, line.getStart().getY());
        assertEquals(10, line.getEnd().getX());
        assertEquals(10, line.getEnd().getY());

        line.moveEndTo(20, 20);
        assertEquals(20, line.getEnd().getX());
        assertEquals(20, line.getEnd().getY());

        //this assert should pass, because modifications on the existing Point object of the line should be represented by the actual object (which is stored in initialEnd).
        assertEquals(20, initialEnd.getX());
        assertEquals(20, initialEnd.getY());


        Point newEnd = new Point(50, 50);
        line.setEnd(newEnd);
        assertEquals(50, line.getEnd().getX());
        assertEquals(50, line.getEnd().getY());

        //    this assert should fail, because we're not modifying the initialEnd point but actually creating a new point object!
        assertEquals(line.getEnd().getX(), initialEnd.getX());
        assertEquals(line.getEnd().getY(), initialEnd.getY());
    }

}