package ch.hslu.sw_08.shape;

import ch.hslu.sw_05.shape.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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