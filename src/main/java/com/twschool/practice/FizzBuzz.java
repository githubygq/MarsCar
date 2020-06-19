package com.twschool.practice;

public class FizzBuzz {
//    public String say(int i) {
//        String s="";
//        if(i%3==0){
//            s+="Fizz";
//        }
//        if (i%5==0){
//            s+="Buzz";
//        }
//        if (i%7==0){
//            s+="Whizz";
//        }
//        if ("".equals(s)){
//            s=String.valueOf(i);
//        }
//        return  s;
//    }

    public String say(int i) {
        String res = String.valueOf(i);
        String s = "";
        if (res.contains("7")) {
            if (i % 3 == 0) {
                s += "Fizz";
            }
            if (i % 7 == 0) {
                s += "Whizz";
            }
        } else if (res.contains("5")) {
            if (i % 5 == 0) {
                s += "Buzz";
            }
            if (i % 7 == 0) {
                s += "Whizz";
            }
        } else {
            if (res.contains("3")) {
                s += "Fizz";
                return s;
            }
            if (i % 3 == 0) {
                s += "Fizz";
            }
            if (i % 5 == 0) {
                s += "Buzz";
            }
            if (i % 7 == 0) {
                s += "Whizz";
            }
        }
//        if (i%5==0){
//            s+="Buzz";
//        }
//        if (i%7==0){
//            s+="Whizz";
//        }
        if ("".equals(s)) {
            s = String.valueOf(i);
        }
        return s;
    }
}

class test {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.say(99));
        System.out.println("13".contains("3"));
    }
}
