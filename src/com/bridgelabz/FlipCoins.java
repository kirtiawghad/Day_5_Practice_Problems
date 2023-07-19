package com.bridgelabz;

import java.util.Scanner;

public class FlipCoins {
    public static void main(String[] args) {
        int head = 0 , tails = 0;
        double random = 0.0;
        Scanner sc = new Scanner(System.in);
        int flip = sc.nextInt();

        System.out.println("flip the coins number of times :");

        int i=1;
        while (i<=flip){

            random = Math.random();
            System.out.println(i + " "+ random);

            if (random < 0.5){
                head++;
                System.out.println("head" );
            }else {
                tails++;
                System.out.println("tails" );
            }
            i++;
        }

        System.out.println("number of heads"+head);
        System.out.println("number of tails" +tails);

        double headpersent = (double) head/flip*100;
        double tailspercentage = (double) tails/flip*100;

        System.out.println("percentage of head"+" " + headpersent);
        System.out.println("percentage of tails" + " " + tailspercentage );

    }
}
