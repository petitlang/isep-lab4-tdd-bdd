package com.isep.lab4;

/** Converts integers in the lab range 1..1000 to standard Roman numerals. */
public class RomanNumerals {
    public String convert(int number) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < values.length; index++) {
            while (number >= values[index]) {
                result.append(symbols[index]);
                number -= values[index];
            }
        }
        return result.toString();
    }
}
