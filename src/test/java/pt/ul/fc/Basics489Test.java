package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Basics489Test {

    @Test
    void areaWorks() {
        assertEquals(12, Basics489.area(3, 4));
        assertEquals(35, Basics489.area(5, 7));
    }

    @Test
    void magnitudeWorks() {
        assertEquals(5, Basics489.magnitude(5));
        assertEquals(5, Basics489.magnitude(-5));
    }

    @Test
    void sumWorks() {
        assertEquals(7, Basics489.sum(3, 4));
        assertEquals(0, Basics489.sum(-2, 2));
    }

    @Test
    void convertTempWorks() {
        assertEquals(32, Basics489.convertTemp(0));
    }

    @Test
    void hasEvenParityWorks() {
        assertEquals("True", Basics489.hasEvenParity(2));
    }
}
