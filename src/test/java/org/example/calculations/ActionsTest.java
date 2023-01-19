package org.example.calculations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ActionsTest {
    Actions ac = new Actions();
    @Test
    void plusPositiveTest() {
        Assertions.assertEquals(5.0, ac.plus(2.0, 3.0), "Plus went wrong!");
    }

    @Test
    void minusTest() {
        Assertions.assertEquals(-1.0, ac.minus(2.0, 3.0), "Minus went wrong!");
    }

    @Test
    void divisionTest() {
        Assertions.assertEquals(2, ac.division(6.0, 3.0), "Division went wrong!");
    }

    @Test
    void multiplyTest() {
        Assertions.assertEquals(10.0, ac.multiply(4.0, 2.5), "Multiplication went wrong!");
    }
}