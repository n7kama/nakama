/**
 * Homework 2 
 * 
 * @author Charlie Le
 * September 13, 2019
 */

 // I am creating an algorithm to guess a number chosen by the user between 0 and 100 by using the higher/lower method.

 // import scanner.
 import java.util.Scanner;

 // make class.
 public class HW2{
    public static void main(String [] args){
        //make method.

        Scanner input = new Scanner(System.in) ;
        //make scanner.

        int min = 1 ;
        //make variable to hold the lower number.
        int max = 100 ;
        //make a variable to hold the higher number.
        boolean guessCorrect = false ;
        // set a boolean variable that sets guessing the number correct to false
        int guesses = 1 ;
        // make a counter and set it equal to one because it wont count the initial guess
        int initGuess = 50 ;
        // set the initial guess to 50

        System.out.printf("%s%n%s%n%s%n", "Welcome to the first game I made!" , "Im going to guess the number that you choose from 1 to 100 and tell you how many guesses it took me!", "Type higher if your number is higher. Type lower if your number is lower. Type correct if the guess is correct. " );
        //Print out the rules

        while (guessCorrect == false){
        //make a while loop and set it equal to false
            System.out.println("Is your number " + initGuess + "?");
            // print out the question to ask the player

            String answer = input.next();
            // create the variable to hole the user input

            if(answer.equals("higher")) {
            // if higher
                min = ((min + max) / 2)+1 ;
                // I needed to add one becaues it wont ask if the answer is 100 if the player chooses 100
                initGuess = (min + max) / 2 ;
                guesses++;
                // add 1 to counter
            }

            if (answer.equals("lower")) {
            // if lower
                max = (max + min) / 2 ;
                initGuess = (max + min) / 2 ;
                guesses++;
                // add 1 to counter

            }
            if (answer.equals("correct")){
            //if correct
                guessCorrect = true ;
                // if the loop guesses the right number, break the loop
            }
            
        }
        if(guessCorrect) {
            System.out.println("It took me " + guesses +" tries to guess your number!");
            // Print out the amount of time it took to guees the right number
        }
        System.out.println("Thanks for playing!");
        // Print out a thanks for playing
     }
 }