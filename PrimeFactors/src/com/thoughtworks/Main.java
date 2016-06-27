package com.thoughtworks;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	NumberGenerator numberGenerator=new NumberGenerator();
       ArrayList primeFactors= numberGenerator.generatePrimeFactors(30);
        for(Object i:primeFactors){
            System.out.print(i+" ");
        }
    }
}
