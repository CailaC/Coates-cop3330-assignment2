/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caila Coates
 */
package ex37;

import java.util.Scanner;
import java.util.ArrayList;
import  java.util.Random;
import java.util.Collections;
import java.lang.Math;

public class ex37Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        int minLength = Integer.parseInt(input.nextLine());

        System.out.print("How many special characters? ");
        int specialChar = Integer.parseInt(input.nextLine());

        System.out.print("How many numbers? ");
        int numAmt = Integer.parseInt(input.nextLine());


        System.out.println("Your password is " + generatePassword(minLength, specialChar, numAmt));
    }

    public static String generatePassword(int minLength, int specChar, int nums) {

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*";
        String numbers = "1234567890";

        Random random = new Random();
        ArrayList<Character> chars = new ArrayList<>();

        for(int i=0; i<specChar; i++){
            chars.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        }

        for(int i=0; i<nums; i++){
            chars.add(numbers.charAt(random.nextInt(numbers.length())));
        }

        for(int i=chars.size()-1; i<minLength; i++){
            chars.add(letters.charAt(random.nextInt(letters.length())));
        }


        Collections.shuffle(chars);
        String password = "";

        for(Character s : chars) {
            password += Character.toString(s);
        }

        return password;
    }

}
