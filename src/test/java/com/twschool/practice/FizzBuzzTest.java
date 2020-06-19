package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_given_1(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(1);
        //then
        assertEquals("1",result);
    }

    @Test
    public void should_return_Fizz_given_3(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(3);
        //then
        assertEquals("Fizz",result);
    }

    @Test
    public void should_return_Buzz_given_5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(5);
        //then
        assertEquals("Buzz",result);
    }

    @Test
    public void should_return_Whizz_given_7(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(7);
        //then
        assertEquals("Whizz",result);
    }

    @Test
    public void should_return_Fizz_given_13(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(13);
        //then
        assertEquals("Fizz",result);
    }

    @Test
    public void should_return_Fizz_given_30(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(30);
        //then
        assertEquals("Fizz",result);
    }

    @Test
    public void should_return_BuzzWhizz_given_35(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(35);
        //then
        assertEquals("BuzzWhizz",result);
    }

    @Test
    public void should_return_Fizz_given_75(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(75);
        //then
        assertEquals("Fizz",result);
    }
}
