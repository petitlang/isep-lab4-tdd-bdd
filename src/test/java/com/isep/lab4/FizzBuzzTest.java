package com.isep.lab4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest(name = "FizzBuzz({0}) = {1}")
    @CsvFileSource(resources = "/data/fizzbuzz-cases.csv", numLinesToSkip = 1)
    void returnsTheExpectedRepresentation(int number, String expected) {
        assertEquals(expected, fizzBuzz.convert(number));
    }
}
