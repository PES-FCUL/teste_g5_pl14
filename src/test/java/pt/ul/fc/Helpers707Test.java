package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Helpers707Test {

    @Test
    void magnitudeWorks() {
        assertEquals(5, Helpers707.magnitude(5));
        assertEquals(5, Helpers707.magnitude(-5));
    }

    @Test
    void pickMaxWorks() {
        assertEquals(9, Helpers707.pickMax(9, 2));
        assertEquals(9, Helpers707.pickMax(2, 9));
    }

    @Test
    void divisibleByTwoWorks() {
        assertTrue(Helpers707.divisibleByTwo(4));
        assertFalse(Helpers707.divisibleByTwo(7));
    }
    @Test
    void convertTempWorks() {
        // 0 C = 32 F (0 * 9 / 5 + 32 = 32)
        assertEquals(32.0, Helpers707.convertTemp(0.0));
    }

    @Test
    void midpointWorks() {
        // (10 + 20) / 2 = 15
        assertEquals(15.0, Helpers707.midpoint(10.0, 20.0));
    }
}
