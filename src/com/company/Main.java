package com.company;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        //1. allow user input of a # (guess).
//        //2. tell user if their guess is too high or too low.
//        //3. allow five chances, if the number isn't guessed tell them what the number is.
//        //4. if the number is guessed, congratulate them.
//        //5. allow the user to play again if they wish.
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter your guess: ");
//
//        int randomNumber = (int) Math.ceil(Math.random() * 100);
//
//        int userGuess = input.nextInt();
//
//        if(userGuess > randomNumber) {
//            System.out.println("Your number is too high! Try again.");
//        }
//
//
//
//    }
//}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int count = 0;
//        int i = 0;
//
//        int randomNumber = (int) Math.round(Math.random() * 100); //this is the random int for the game

//        System.out.println("I guessed a random number, now you have 5 chances to guess it. Its between 1 and 100.");

        Scanner input = new Scanner(System.in);
        do{
            int count = 0;
            int i = 0;
            int randomNumber = (int) Math.round(Math.random() * 100); //this is the random int for the game

            System.out.println("I guessed a random number, now you have 5 chances to guess it. Its between 1 and 100.");

            do{
                try {


                    int userGuess = input.nextInt();

                    if (userGuess < randomNumber) {


                        System.out.println("You guessed too small. Try again.");
                    } else if (userGuess > randomNumber) {

                        System.out.println("You guessed too large. Try again.");
                    } else if (userGuess == randomNumber) {

                        System.out.println("You guessed correct. Would you like to play again? Y/N?");
                    }

                }catch(Exception a) {
                    input.nextLine();
                    System.out.println("Please input a number between 100 and 0.");
                    i++;
                }
                i++;
            }while(i < 5);

            input.nextLine();
            System.out.println("You fail! Your number was: " + randomNumber + ". Would you like to try again? y/n");

        }while(input.nextLine().toUpperCase().equals("Y"));


    }
}