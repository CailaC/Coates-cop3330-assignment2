/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caila Coates
 */
package ex33;

import java.util.Scanner;
import java.util.Random;

public class exMain33 {
    public static void main(String[] args){

        Magic8();

    }

    public static void Magic8(){
        Scanner input = new Scanner(System.in);
        System.out.println("What's your question?");
        String question = input.nextLine();
        System.out.println("\n> " + question);

        String[] answersArr = new String[5];
        // initial array values
        String[] arr = {"Yes", "No", "Maybe", "Ask again later."};

        Random arrayNum = new Random();
        int randomNumber = arrayNum.nextInt(arr.length);

        System.out.println(arr[randomNumber]);

    }
}
