package ch.hslu.sw_03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {

    @Test
    public void checkFilterMax(){
        int[] numbers = {4, 19, 33, 0, 417, 90, -34, 22, 1, 91};
        assertEquals(417, Filter.FILTER_MAX(numbers));
    }

}