/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caila Coates
 */
package ex29;

import java.util.Scanner;

public class ex29Main {

    public static void main(String[] args) {

        isValid();

    }

    public static void question(){
        System.out.println("What is the rate of return? ");
    }

    public static int isValid() {
        Scanner input = new Scanner(System.in);
        int rate;

        question();

        //checks that input is an integer
        while (true){
            if (input.hasNextInt()) {

                rate = input.nextInt();

                if (rate != 0) {
                    RORFormula(rate);
                    break;
                }

            }
            System.out.println("Sorry. That's not a valid input.");
            input.nextLine();
            question();
        }
        return rate;
        }

    private static void RORFormula(int rate) {
        int years =0;
        years = 72 / rate;

        System.out.println("It will take " + years + " years to double your initial investment.");
    }
}
