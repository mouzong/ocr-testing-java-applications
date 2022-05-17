package com.codegrill.andreas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class CalculatorTest {
    @Test
    void shouldAddTwoPositiveIntegers(){
        // Arrange
        int a = 2;
        int b = 3;

        Calculator calculator = new Calculator();

        // Action
        int result = calculator.add(a,b);


        // Assert
        assertEquals(5,result);
    }
}
