package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner Sc = new Scanner(System.in);
        int guessNumber = 0;
        int secretNumber = 123;

        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.println("Enter you random number");
        guessNumber = Sc.nextInt();

        while (guessNumber != secretNumber) {
            System.out.println("Try again!");
            System.out.println("Enter a number");
            guessNumber = Sc.nextInt();
            if (guessNumber == 5) break;
        }System.out.println("You are correct");
  }

}



