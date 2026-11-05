package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Helpers642Test {

    @Test
    void cToFWorks() {
        assertEquals(212.0, Helpers642.cToF(100.0), 1e-9);
        assertEquals(32.0, Helpers642.cToF(0.0), 1e-9);
    }

    @Test
    void shoutWorks() {
        assertEquals("HELLO", Helpers642.shout("hello"));
        assertEquals("ABC", Helpers642.shout("aBc"));
    }

    @Test
    void multiplyWorks() {
        assertEquals(5 * 3, Helpers642.multiply(5));
        assertEquals(0, Helpers642.multiply(0));
    }
    @Test
void testDivisibleByTwo() {
    assertTrue(Helpers642.divisibleByTwo(2));
}

@Test
void testSum() {
    assertEquals(8, Helpers642.sum(5, 3));
}
}
