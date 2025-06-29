package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        System.out.println("Setting up...");
        calc = new Calculator(); // Arrange
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calc = null;
    }

    @Test
    public void testAddition() {
        // Act
        int result = calc.add(2, 3);
        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        // Act
        int result = calc.subtract(10, 4);
        // Assert
        assertEquals(6, result);
    }
}
