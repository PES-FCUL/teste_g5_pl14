package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc142Test {

    @Test
    void celsiusToFWorks() {
        assertEquals(212.0, Calc142.celsiusToF(100.0), 1e-9);
        assertEquals(32.0, Calc142.celsiusToF(0.0), 1e-9);
    }

    @Test
    void evenWorks() {
        assertTrue(Calc142.even(4));
        assertFalse(Calc142.even(7));
    }

    @Test
    void loudWorks() {
        assertEquals("HELLO", Calc142.loud("hello"));
        assertEquals("ABC", Calc142.loud("aBc"));
    }
    @Test 
    void plusWorks() {
        assertEquals(4, Calc142.plus(2, 2));
    }

    @Test 
    void amplifyWorks() {
        assertEquals(72, Calc142.amplify(8));
    }
}
