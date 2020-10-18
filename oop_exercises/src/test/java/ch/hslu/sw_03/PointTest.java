package ch.hslu.sw_03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    public void checkQuadrant(){
        Point p1 = new Point(30, 50);
        Point p2 = new Point(-30, 50);
        Point p3 = new Point(-30, -50);
        Point p4 = new Point(30, -50);
        Point p5 = new Point(0, 0);
        Point p6 = new Point(0, 50);
        Point p7 = new Point(30, 0);

        assertEquals(1, p1.getQuadrant());
        assertEquals(2, p2.getQuadrant());
        assertEquals(3, p3.getQuadrant());
        assertEquals(4, p4.getQuadrant());
        assertEquals(0, p5.getQuadrant());
        assertEquals(0, p6.getQuadrant());
        assertEquals(0, p7.getQuadrant());
    }
}