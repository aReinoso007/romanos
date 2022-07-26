package com.bayteq.tdd.romanos;


import org.junit.Assert;
import org.junit.Test;
public class RomanNumberTest {

    private final RomanNumber romanNumber = new RomanNumber();

    @Test
    public void testA(){
        //setup
        //exercise
        String roman = romanNumber.convertToRomanString(1);
        //assert
        Assert.assertEquals("I", roman);
    }

    @Test
    public void testB(){
        //setup
        //exercise
        String roman =  romanNumber.convertToRomanString(2);
        //assert
        Assert.assertEquals("II", roman);
    }

    @Test
    public void testC(){
        //setup
        //exercise
        String roman =  romanNumber.convertToRomanString(3);
        //assert
        Assert.assertEquals("III", roman);
    }

    @Test
    public void testD(){
        //setup
        //exercise
        String roman =  romanNumber.convertToRomanString(4);
        //assert
        Assert.assertEquals("IV", roman);
    }
}
