package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc446Test {

    @Test
    void surfaceWorks() {
        assertEquals(12, Calc446.surface(3, 4));
        assertEquals(35, Calc446.surface(5, 7));
    }

    @Test
    void biggestWorks() {
        assertEquals(9, Calc446.biggest(9, 2));
        assertEquals(9, Calc446.biggest(2, 9));
    }

    @Test
    void isPositiveWorks() {
        assertTrue(Calc446.isPositive(3));
        assertFalse(Calc446.isPositive(-3));
        assertFalse(Calc446.isPositive(0));
    }

    @Test 
    void absWorks() {
        assertEquals(3, Calc446.abs(-3));
        assertEquals(3, Calc446.abs(3));
        assertEquals(0, Calc446.abs(0));
    }

    @Test 
    void loudWorks() {
        assertEquals("HELLO", Calc446.loud("hello"));
        assertEquals("WORLD", Calc446.loud("world"));
    }
}
