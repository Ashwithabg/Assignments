package com.thoughtworks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number of lines :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i, j, k;
        for (i = 1; i <= number; i++) {
            for (j = i; j < number; j++) {
                System.out.print(" ");
            }
            for (k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }


}