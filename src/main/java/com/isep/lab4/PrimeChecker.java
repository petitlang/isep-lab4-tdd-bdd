package com.isep.lab4;

/** Determines whether a nonnegative integer is prime. */
public class PrimeChecker {
    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
