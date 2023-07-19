package com.bridgelabz;

import java.util.Scanner;

public class FindQuoAndReminder {
    public static void main(String[] args) {
        float Quotient, reminder;
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = sc.nextInt();
        System.out.println("enter the Second number");
        num2 = sc.nextInt();
        Quotient = num1 / num2;
        System.out.println("The Quotient is :"+Quotient);
        reminder = num1 % num2;
        System.out.println("the teminder is :"+reminder);
    }
}
