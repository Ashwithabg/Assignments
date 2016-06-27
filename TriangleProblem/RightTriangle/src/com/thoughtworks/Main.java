package com.thoughtworks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number of lines :");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
