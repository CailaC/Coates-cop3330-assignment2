/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caila Coates
 */
package ex28;

import java.util.Scanner;

public class ex28Main {
    public static void main( String[] args ){

        findTotal();

    }

    public static void findTotal(){
        Scanner input = new Scanner(System.in);

        int i;
        int num = 0;
        int total = 0;
        int tempNum = 0;

        for (i=0;i<5;i++) {
            System.out.println("Enter a number: ");
            num = input.nextInt();
            total = tempNum + num;
            tempNum = total;

        }
        System.out.println("The total is " + total + ".");
    }
}
