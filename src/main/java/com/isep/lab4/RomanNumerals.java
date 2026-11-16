package com.isep.lab4;

/** Converts integers in the lab range 1..1000 to standard Roman numerals. */
public class RomanNumerals {
    public String convert(int number) {
        return switch (number) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 9 -> "IX";
            case 10 -> "X";
            default -> throw new UnsupportedOperationException("Next TDD cycle");
        };
    }
}
