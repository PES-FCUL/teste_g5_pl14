package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

class Helpers476Test {

    @Test
    void positiveWorks() {
        assertTrue(Helpers476.positive(3));
        assertFalse(Helpers476.positive(-3));
        assertFalse(Helpers476.positive(0));
    }

    @Test
    void convertTempWorks() {
        assertEquals(212.0, Helpers476.convertTemp(100.0), 1e-9);
        assertEquals(32.0, Helpers476.convertTemp(0.0), 1e-9);
    }

    @Test
    void toUpperWorks() {
        assertEquals("HELLO", Helpers476.toUpper("hello"));
        assertEquals("ABC", Helpers476.toUpper("aBc"));
    }

    @Test
    void isEvenWorks() {
        assertTrue(Helpers476.isEven(2));
        assertFalse(Helpers476.isEven(3));
    }

    @Test
    void surfaceWorks() {
        assertEquals(16, Helpers476.surface(4, 4));
        assertEquals(12, Helpers476.surface(2, 3));
    }

}
