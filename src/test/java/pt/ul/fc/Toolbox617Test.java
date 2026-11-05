package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox617Test {

    @Test
    void celsiusToFWorks() {
        assertEquals(212.0, Toolbox617.celsiusToF(100.0), 1e-9);
        assertEquals(32.0, Toolbox617.celsiusToF(0.0), 1e-9);
    }

    @Test
    void evenWorks() {
        assertTrue(Toolbox617.even(4));
        assertFalse(Toolbox617.even(7));
    }

    @Test
    void toUpperWorks() {
        assertEquals("HELLO", Toolbox617.toUpper("hello"));
        assertEquals("ABC", Toolbox617.toUpper("aBc"));
    }

    @Test
    void multiplyWorks{
        assertEquals(81, Toolbox617.multiply(9));
    }

    @Test
    void aboveZeroWorks{
        assertTrue(True, Toolbox617.isAboveZero(21));
    }
}
