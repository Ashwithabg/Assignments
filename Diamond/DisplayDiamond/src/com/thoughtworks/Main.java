package com.thoughtworks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int i,j,k;
        System.out.println("enter the number of line");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        for(i=1;i<=number;i++){
            for(j=i;j<number;j++){
                System.out.print(" ");
            }
           for(k=1;k<i*2;k++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(i=number-1;i>0;i--){
            for(j=i;j<number;j++){
                System.out.print(" ");
            }
            for(k=1;k<i*2;k++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
