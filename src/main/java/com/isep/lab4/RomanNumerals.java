package com.isep.lab4;

import java.util.List;

/** Converts integers in the lab range 1..1000 to standard Roman numerals. */
public class RomanNumerals {
    private record Symbol(int value, String text) {}

    private static final List<Symbol> SYMBOLS = List.of(
            new Symbol(1000, "M"), new Symbol(900, "CM"),
            new Symbol(500, "D"), new Symbol(400, "CD"),
            new Symbol(100, "C"), new Symbol(90, "XC"),
            new Symbol(50, "L"), new Symbol(40, "XL"),
            new Symbol(10, "X"), new Symbol(9, "IX"),
            new Symbol(5, "V"), new Symbol(4, "IV"), new Symbol(1, "I"));

    public String convert(int number) {
        StringBuilder result = new StringBuilder();
        for (Symbol symbol : SYMBOLS) {
            while (number >= symbol.value()) {
                result.append(symbol.text());
                number -= symbol.value();
            }
        }
        return result.toString();
    }
}
