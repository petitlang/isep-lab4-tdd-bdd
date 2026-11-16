package com.isep.lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void oneIsReturnedAsAString() {
        assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    void twoIsReturnedAsAString() {
        assertEquals("2", fizzBuzz.convert(2));
    }
}
