package com.thoughtworks;

public class Main {

    public static void main(String[] args) {
        System.out.println("welcome to FIZZBUZZ game");
        NumberGenerator numberGenerator=new NumberGenerator();
        System.out.println("numbers 1 to 100 are");
        numberGenerator.fizzBuzz();

    }
}
