package com.bayteq.tdd.romanos;

public class RomanNumber {

    public String convertToRomanString(int number){
        String res = "";
        if(number == 1){
            res = "I";
        }else if (number ==2){
            res="II";
        }
        return res;
    }
}
