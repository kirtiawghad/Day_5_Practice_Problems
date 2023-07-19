package com.bridgelabz;

import java.util.Scanner;

public class LargestThreeNumber {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 > num2 && num1>num3){
            System.out.println("Greter Number is :" + num1);
        } else if (num2 > num1 && num2 > num3) {

            System.out.println("Greater num is :" + num2);

        } else if (num3 > num1 && num3 > num2) {

            System.out.println("Greter num is :"+num3);

        }else {
            System.out.println("invalid num");
        }

    }
    }

