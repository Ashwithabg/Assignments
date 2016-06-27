package com.thoughtworks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number of asterisk :");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        for(int i=0;i<number;i++){
            System.out.print("*");
       }

    }
}
