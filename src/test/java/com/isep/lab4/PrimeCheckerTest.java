package com.isep.lab4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeCheckerTest {
    private final PrimeChecker checker = new PrimeChecker();

    @ParameterizedTest(name = "isPrime({0}) = {1}")
    @CsvFileSource(resources = "/data/prime-cases.csv", numLinesToSkip = 1)
    void checksEveryNumberFromZeroThroughOneHundred(int number, boolean expected) {
        assertEquals(expected, checker.isPrime(number), () -> "Primality of " + number);
    }
}
