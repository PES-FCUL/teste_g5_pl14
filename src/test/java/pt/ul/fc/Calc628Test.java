package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

class Calc628Test {

    @Test
    void celsiusToFWorks() {
        assertEquals(212.0, Calc628.celsiusToF(100.0), 1e-9);
        assertEquals(32.0, Calc628.celsiusToF(0.0), 1e-9);
    }

    @Test
    void pickMaxWorks() {
        assertEquals(9, Calc628.pickMax(9, 2));
        assertEquals(9, Calc628.pickMax(2, 9));
    }

    @Test
    void addWorks() {
        assertEquals(7, Calc628.add(3, 4));
        assertEquals(0, Calc628.add(-2, 2));
    }

    @Test
    void isPositive() {
        assertEquals(true, Calc628.isPositive(5));
    }

    @Test
    void amplify(){
        assertEquals(8, Calc628.amplify(2));
    }
}
