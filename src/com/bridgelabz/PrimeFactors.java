package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
      int num, temp,i=2;
      Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
      num = sc.nextInt();
      temp = num;
        System.out.println("prime factorials of number");
      while (temp > 1){

          if (temp % i == 0){

              System.out.println(i + " ");
              temp = temp/i;

          }else {
              i++;
          }

      }
    }
}
