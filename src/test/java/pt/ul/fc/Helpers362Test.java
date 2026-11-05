package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Helpers362Test {

    @Test
    void evenWorks() {
        assertTrue(Helpers362.even(4));
        assertFalse(Helpers362.even(7));
    }

    @Test
    void loudWorks() {
        assertEquals("HELLO", Helpers362.loud("hello"));
        assertEquals("ABC", Helpers362.loud("aBc"));
    }

    @Test
    void midpointWorks() {
        assertEquals(5.0, Helpers362.midpoint(4.0, 6.0), 1e-9);
        assertEquals(0.0, Helpers362.midpoint(-1.0, 1.0), 1e-9);
    }
    @Test
void addReturnsSum() {
    assertEquals(5, Helpers362.add(2, 3));
}

@Test
void timesMultipliesBySeven() {
    assertEquals(21, Helpers362.times(3));
}
}
