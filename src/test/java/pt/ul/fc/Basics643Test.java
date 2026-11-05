package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Basics643Test {

    @Test
    void cToFWorks() {
        assertEquals(212.0, Basics643.cToF(100.0), 1e-9);
        assertEquals(32.0, Basics643.cToF(0.0), 1e-9);
    }

    @Test
    void avgWorks() {
        assertEquals(5.0, Basics643.avg(4.0, 6.0), 1e-9);
        assertEquals(0.0, Basics643.avg(-1.0, 1.0), 1e-9);
    }

    @Test
    void addWorks() {
        assertEquals(7, Basics643.add(3, 4));
        assertEquals(0, Basics643.add(-2, 2));
    }

    @Test
    void areaWorks() {
        assertEquals(16, Basics643.area(4, 4));
        assertEquals(12, Basics643.area(3, 4));
    }

    @Test
    void isEvenWorks() {
        assertEquals(true, Basics643.isEven(2));
        assertEquals(false, Basics643.isEven(3));
    }
}
