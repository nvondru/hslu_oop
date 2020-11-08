package ch.hslu.sw_07;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    Point point;

    @BeforeEach
    public void setup(){
        point = new Point(20, 40);
    }

    @Test
    public void checkEqualsContract(){
        EqualsVerifier.forClass(Point.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void checkPointEquality(){
        Point other = new Point(20, 40);
        assertEquals(other, point);
    }

    @Test
    public void checkPointHashCodes(){
        Point other = new Point(20, 40);
        assertEquals(other.hashCode(), point.hashCode());
    }

}