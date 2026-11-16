package com.isep.lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PrimeCheckerTest {
    private final PrimeChecker checker = new PrimeChecker();

    @Test
    void zeroIsNotPrime() {
        assertFalse(checker.isPrime(0));
    }

    @Test
    void oneIsNotPrime() {
        assertFalse(checker.isPrime(1));
    }

    @Test
    void twoIsPrime() {
        assertTrue(checker.isPrime(2));
    }

}
