package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //1. allow user input of a # (guess).
        //2. tell user if their guess is too high or too low.
        //3. allow five chances, if the number isn't guessed tell them what the number is.
        //4. if the number is guessed, congratulate them.
        //5. allow the user to play again if they wish.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your guess: ");
        
        int userGuess = input.nextInt();



    }
}
