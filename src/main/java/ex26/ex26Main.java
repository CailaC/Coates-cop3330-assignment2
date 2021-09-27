/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caila Coates
 */
package ex26;

import java.util.Scanner;

public class ex26Main {

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your credit card balance? ");
        double cardBalance = input.nextInt();
        System.out.println("What is the APR on the card (as a percent)? ");
        double apr = input.nextInt();
        System.out.println("What is the monthly payment you can make? ");
        double monthlyPayment = input.nextInt();

        PaymentCalculator payPlan = new PaymentCalculator(cardBalance, apr, monthlyPayment);

        double numOfMonths = payPlan.calculateMonthsUntilPaidOff();
        System.out.println("It will take you " + numOfMonths + " months to pay off this card");
    }
}
