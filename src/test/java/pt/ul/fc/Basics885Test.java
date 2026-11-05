package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Basics885Test {

    @Test
    void greaterThanZeroWorks() {
        assertTrue(Basics885.greaterThanZero(3));
        assertFalse(Basics885.greaterThanZero(-3));
        assertFalse(Basics885.greaterThanZero(0));
    }

    @Test
    void surfaceWorks() {
        assertEquals(12, Basics885.surface(3, 4));
        assertEquals(35, Basics885.surface(5, 7));
    }

    @Test
    void biggestWorks() {
        assertEquals(9, Basics885.biggest(9, 2));
        assertEquals(9, Basics885.biggest(2, 9));
    }

    @Test
    void edgeCasesWorks() {
        // Testa valores iguais ou extremos para expor potenciais bugs nos métodos
        assertEquals(5, Basics885.biggest(5, 5));
        assertEquals(0, Basics885.surface(0, 5));
    }
}