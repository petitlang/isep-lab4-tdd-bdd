package com.isep.lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PrimeCheckerTest {
    private final PrimeChecker checker = new PrimeChecker();

    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    void numbersBelowTwoAreNotPrime(int number) {
        assertFalse(checker.isPrime(number));
    }

    @Test
    void twoIsPrime() {
        assertTrue(checker.isPrime(2));
    }

}
