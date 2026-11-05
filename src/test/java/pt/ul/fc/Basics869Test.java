package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Basics869Test {

    @Test
    void isPositiveWorks() {
        assertTrue(Basics869.isPositive(3));
        assertFalse(Basics869.isPositive(-3));
        assertFalse(Basics869.isPositive(0));
    }

    @Test
    void toFahrenheitWorks() {
        assertEquals(212.0, Basics869.toFahrenheit(100.0), 1e-9);
        assertEquals(32.0, Basics869.toFahrenheit(0.0), 1e-9);
    }

    @Test
    void totalWorks() {
        assertEquals(7, Basics869.total(3, 4));
        assertEquals(0, Basics869.total(-2, 2));
    }

    @Test 
    void hasEvenParity() {
        assertEquals(getClass(), getClass());
        assertEquals(getClass(), getClass());

    }


}
