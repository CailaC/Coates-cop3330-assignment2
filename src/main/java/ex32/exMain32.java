/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caila Coates
 */
package ex32;

import java.util.Scanner;
import java.util.Random;

public class exMain32 {

    public static void main(String[] args){

        StartGame();

    }

    public static void StartGame(){
        Scanner input = new Scanner(System.in);

        System.out.println("Let's play Guess the Number! \n");
        System.out.println("Enter the difficulty level (1, 2, or 3): ");
        int difficultyLevel = input.nextInt();
        difficultyLevels(difficultyLevel);

    }

    public static void difficultyLevels(int difficultyLevel){
        Scanner input = new Scanner(System.in);
        int randomNum =0;

        if(difficultyLevel == 1){
            Random random = new Random();
            randomNum = random.nextInt(10 - 0) + 0;

        }else if(difficultyLevel == 2){
            Random random = new Random();
            randomNum = random.nextInt(100 - 0) + 0;

        }else if(difficultyLevel == 3){
            Random random = new Random();
            randomNum = random.nextInt(1000 - 0) + 0;
        }

        System.out.println("I have my number. What's your guess? ");
        int userGuess = input.nextInt();

        int count = 0;
        GuessChecker(userGuess, randomNum, count);

    }

    public static void GuessChecker(int userGuess, int randomNum, int count){
        Scanner input = new Scanner(System.in);
        //int numOfGuesses = 1;
        //boolean isCorrect = true;

          while(userGuess != randomNum){
            if(userGuess == randomNum) {
                //numOfGuesses += 1;
                counter(count);
                break;

            }else if (userGuess < randomNum) {
                //numOfGuesses +=1;
                counter(count);
                System.out.println("Too low. Guess again: ");
                int newRandomNum = input.nextInt();
                GuessChecker(newRandomNum, randomNum, count);

            } else if (userGuess > randomNum) {
                //numOfGuesses += 1;
                counter(count);
                System.out.println("Too high. Guess again: ");
                int newRandomNum = input.nextInt();
                GuessChecker(newRandomNum, randomNum, count);
            }

            System.out.println("You got it in " + count + " guesses!");
            System.out.println("Do you wish to play again? (Y/N)?");

            if(input.next() == "Y"){
                StartGame();
            }
        }

    }

    public static int counter(int count){
        count = count + 1;
        return count;

    }
}
