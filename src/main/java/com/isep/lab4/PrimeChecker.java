package com.isep.lab4;

/** Determines whether a nonnegative integer is prime. */
public class PrimeChecker {
    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        // A composite number has a factor at most its square root.
        // Division avoids overflow from divisor * divisor for large integers.
        for (int divisor = 2; divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
