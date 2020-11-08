package ch.hslu.sw_06.calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    // testing different JUnit Annotations
    @BeforeAll
    static void init(){
        System.out.println("Initializing test run!");
    }

    @AfterAll
    static void report(){
        System.out.println("Finalizing test run!");
    }

    @BeforeEach
    void setup(){
        calculator = new Calculator();
        System.out.println("Starting test...");
    }

    @AfterEach
    void afterEach(){
        System.out.println("... test ended!");
    }



    @Test
    void checkAdditionWithPositiveValues(){
        int result = calculator.sumUp(10, 20);
        assertEquals(30, result);
    }

    @Test
    void checkAdditionWithNegativeValues(){
        int result = calculator.sumUp(-10, -20);
        assertEquals(-30, result);
    }

    @Test
    void checkAdditionWithZero(){
        int result = calculator.sumUp(20, 0);
        assertEquals(20, result);
    }

    @Test
    void checkIntegerUndeflow(){
        Assertions.assertThrows(ArithmeticException.class, () -> {
           calculator.sumUp(-1, Integer.MIN_VALUE);
        });
    }

    @Test
    void checkIntegerOverflow(){
        assertThrows(ArithmeticException.class, () -> {
           calculator.sumUp(1, Integer.MAX_VALUE);
        });
    }
    





}