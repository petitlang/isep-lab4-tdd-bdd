package com.isep.lab4;

/** Converts a positive integer to its FizzBuzz string. */
public class FizzBuzz {

    public String convert(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(number);
    }
}
