package com.isep.lab4;

/** Converts a positive integer to its FizzBuzz string. */
public class FizzBuzz {
    private static final String FIZZ = "Fizz";

    public String convert(int number) {
        if (number % 3 == 0) {
            return FIZZ;
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
