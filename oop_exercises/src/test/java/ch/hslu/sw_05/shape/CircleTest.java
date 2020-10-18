package ch.hslu.sw_05.shape;

import ch.hslu.sw_05.shape.Circle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    private Circle circle;

    @BeforeEach
    void setUp() {
        this.circle = new Circle(10, 20, 10);

    }

    @Test
    public void checkPerimeter(){
        assertEquals(31.416, this.circle.getPerimeter(), 0.01);
    }

    @Test
    public void checkArea(){
        assertEquals(78.54, this.circle.getArea(), 0.01);
    }

}