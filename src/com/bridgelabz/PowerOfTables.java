package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTables {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        double power = Math.pow(2,num);

        for (int i=1; i<=10; i++){
            double table = power * i;
            System.out.println(table);
        }

    }
}
