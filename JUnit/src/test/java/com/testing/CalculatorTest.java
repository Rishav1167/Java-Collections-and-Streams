package com.testing;


import com.testing.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator cal;
    @BeforeEach
    void setUp(){
        cal=new Calculator();
    }

    @Test
    void testAdd(){
        assertEquals(0,cal.add(5,5));
    }

    @Test
    void testSubtract(){
        assertEquals(10,cal.subtract(20,10));
    }

    @Test
    void testMultiply(){
        assertEquals(15,cal.multiply(5,3));
    }
    @Test
    void testDevide(){
        assertEquals(1,cal.divide(5,5));
    }

    @Test
    void testDevideByZero(){
        assertThrows(ArithmeticException.class,()->cal.divide(5,0));
    }
    
}
