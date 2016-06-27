package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashwitha on 27/6/16.
 */
public class NumberGenerator {
    public ArrayList<Integer> generatePrimeFactors(int number) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        for(int i=2; i<=number; i++){
            while(number%i==0){
                primeFactors.add(i);
                number = number/i;
            }
        }
        return primeFactors;
    }
}
