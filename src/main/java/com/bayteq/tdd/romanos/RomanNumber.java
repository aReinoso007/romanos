package com.bayteq.tdd.romanos;

public class RomanNumber {

    public String convertToRomanString(int numberToConvert){

        return convertDigitToRoman(numberToConvert);

    }

    private String convertDigitToRoman(int numberToConvert) {
        String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] decenas = {"X", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

        return unidades[numberToConvert %10];
    }
}
