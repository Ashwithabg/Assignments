package com.thoughtworks;

/**
 * Created by ashwitha on 27/6/16.
 */
public class NumberGenerator {
    public void fizzBuzz(){
        for(int number=1;number<=100;number++){
            if(number%5==0 && number%3==0){
                System.out.println("FizzBuzz");
            }
            else if( number%5==0){
                System.out.println("Buzz");
            }
            else if(number%3==0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(number);
            }
        }
    }
}
