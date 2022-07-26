package com.bayteq.tdd.romanos;

public class RomanNumber {

    public String convertToRomanString(int number){
        if(number > 10){

        }else if (number > 100){

        }
        String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] decenas = {"X", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

        return unidades[number];

    }
}
