package org.example;/*
  @author   Olha
  @project   lab2
  @class  Util
  @version  1.0.0 
  @since 15.02.2024 - 19.18
*/


import java.util.HashMap;

public class Util {
    private static final HashMap<Character, Integer> ROMAN_VALUES = new HashMap<>();

    static {
        ROMAN_VALUES.put('I', 1);
        ROMAN_VALUES.put('V', 5);
        ROMAN_VALUES.put('X', 10);
        ROMAN_VALUES.put('L', 50);
        ROMAN_VALUES.put('C', 100);
        ROMAN_VALUES.put('D', 500);
        ROMAN_VALUES.put('M', 1000);
    }

    public static int convertRomanToArabic(String romanNumeral) {
        if (romanNumeral == null || romanNumeral.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }

        int arabicNumber = 0;
        int previousValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentChar = romanNumeral.charAt(i);
            if (!ROMAN_VALUES.containsKey(currentChar)) {
                throw new IllegalArgumentException("Invalid Roman numeral: " + romanNumeral);
            }

            int currentValue = ROMAN_VALUES.get(currentChar);
            if (currentValue < previousValue) {
                arabicNumber -= currentValue;
            } else {
                arabicNumber += currentValue;
            }
            previousValue = currentValue;
        }

        return arabicNumber;
    }
}
