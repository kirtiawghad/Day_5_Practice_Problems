package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");

        num = sc.nextInt();
        double result = 0.0;

        System.out.println("the harmonic series is  :");

        for (int i = num; i>0; i--){
            result = result + (double) 1/i;

            System.out.println(result + " ");

        }


    }
}
