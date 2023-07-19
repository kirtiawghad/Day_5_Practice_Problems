package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumber {

    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Before swaping");
        System.out.println(num1);
        System.out.println(num2);

        num1 = num1 - num2;
        num2 = num1 + num2;
        num1 = num2 - num1;

        System.out.println("after swaping");
        System.out.println(num1);
        System.out.println(num2);


    }
}
