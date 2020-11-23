package com.example.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator c;
    @BeforeEach
    void setUp() {
        c = new Calculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        assertEquals(3, c.add(1,2));
    }

    @Test
    void sub(){
        assertEquals(1,c.sub(3,2));
    }

    @Test
    void multiply(){
        assertEquals(4,c.multiply(2,2));
    }

    @Test
    void divide(){
        assertEquals(2,c.divide(10,5));
    }
}