package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    Sum s;
    @BeforeEach
    void setUp() {
        s = new Sum();
    }

    @Test
    void sum_odd_ok() {
        int result = s.sumOdd();
        int expected = 250000;
        assertEquals(expected, result);
    }
    @Test
    void sum_odd_throw() {
        int result = s.sumOdd();
        int unexpected = 0;
        assertNotEquals(unexpected, result);
    }
    @Test
    void sum_odd_249999() {
        int result = s.sumOdd();
        int expected = 249999;
        assertNotEquals(expected, result);
    }
    @Test
    void sum_odd_250001() {
        int result = s.sumOdd();
        int expected = 250001;
        assertNotEquals(expected, result);
    }
    @Test
    void sum_odd_negative() {
        int result = s.sumOdd();
        int unexpected = -250000;
        assertNotEquals(unexpected, result);
    }
}