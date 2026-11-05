package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc935Test {

    @Test
    void totalWorks() {
        assertEquals(7, Calc935.total(3, 4));
        assertEquals(0, Calc935.total(-2, 2));
    }

    @Test
    void absoluteWorks() {
        assertEquals(5, Calc935.absolute(5));
        assertEquals(5, Calc935.absolute(-5));
    }

    @Test
    void multiplyWorks() {
        assertEquals(5 * 3, Calc935.multiply(5));
        assertEquals(0, Calc935.multiply(0));
    }


    @Test
    void capitalizeAllReturnsUpperCase() {
        assertEquals("ola", Calc935.capitalizeAll("ola"));
    }   

    @Test
    void areaOfReturnsCorrectArea() {
        assertEquals(14, Calc935.areaOf(3, 4));
    }



}
