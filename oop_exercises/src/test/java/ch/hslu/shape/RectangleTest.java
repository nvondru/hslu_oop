package ch.hslu.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle;

    @BeforeEach
    void setUp() {
        this.rectangle = new Rectangle(10, 10, 10, 20);
    }

    @Test
    public void checkPerimeter(){
        assertEquals(60, this.rectangle.getPerimeter(), 0.01);
    }

    @Test
    public void checkArea(){
        assertEquals(200, this.rectangle.getArea(), 0.01);
    }
}