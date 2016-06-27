package com.thoughtworks;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        int i,j,k;
        System.out.println("enter the number of line");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        for(i=1;i<=number-1;i++){
            for(j=i;j<number-1;j++){
                System.out.print(" ");
            }
            for(k=1;k<i*2;k++){
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("ASHU");
        for(i=number-1;i>0;i--){
            for(j=i;j<number-1;j++){
                System.out.print(" ");
            }
            for(k=1;k<i*2;k++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
