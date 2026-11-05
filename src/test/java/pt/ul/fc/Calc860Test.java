package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc860Test {

    @Test
    void distanceFromZeroWorks() {
        assertEquals(5, Calc860.distanceFromZero(5));
        assertEquals(5, Calc860.distanceFromZero(-5));
    }

    @Test
    void loudWorks() {
        assertEquals("HELLO", Calc860.loud("hello"));
        assertEquals("ABC", Calc860.loud("aBc"));
    }

    @Test
    void maxOfWorks() {
        assertEquals(9, Calc860.maxOf(9, 2));
        assertEquals(9, Calc860.maxOf(2, 9));
    }

    @Test
    void rectAreaWorks(){
    	assertEquals(4, Calc860.rectArea(2,2));
    }

    @Test
        void averageWorks(){
        	assertEquals(2, Calc860.average(2,2));
    }
}
