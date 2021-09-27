/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caila Coates
 */
package ex25;

import java.util.Scanner;

public class ex25Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password to check password strength: ");
        String password = input.next();

        calculatePasswordStrength(password);
    }


    public static void calculatePasswordStrength(String password) {
        int symbols = 0;
        int digits = 0;
        int letters = 0;
        String result = "The password ' " + password + "' is a ";

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digits++;
            } else if (Character.isLetter(password.charAt(i))) {
                letters++;
            } else {
                symbols++;
            }
        }

        if (password.length() < 8) {
            if (digits == password.length()) {
                result += "very weak password.";
            } else if (letters == password.length()) {
                result += "weak password.";
            }
        } else {

            if (letters != 0 && digits != 0 && symbols != 0) {
                result += "very strong password.";
            } else if (letters != 0 && digits != 0) {
                result += "strong password.";

            }
        }
        System.out.println(result);

    }
}