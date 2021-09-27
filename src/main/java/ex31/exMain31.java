/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caila Coates
 */
package ex31;

import java.util.Scanner;

public class exMain31 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int restingHR = 0;
        int age = 0;

        while (true) {
            System.out.print("Resting Pulse: ");
            if (input.hasNextInt()) {
                restingHR = input.nextInt();
            }

            System.out.print("Age: ");
            if (!input.hasNextInt()) {
                age = input.nextInt();
            }
            heartRateChart(restingHR, age);

        }
    }

    public static void heartRateChart(int restingHR, int age) {

        int rowSize = 9;
        int intensity = 55;

        // first print the top header row
        System.out.format("Intensity    | Rate");
        System.out.println();
        System.out.println("-----------------------------");

        for (int i = 1; i <= rowSize; i++) {
            // print left most column first
            heartRateCalculator(intensity, restingHR, age);
            intensity = intensity + 5;

        }
    }

    public static void heartRateCalculator(int intensity, int restingHR, int age){
        int TargetHeartRate;

        TargetHeartRate = (((220 - age) - restingHR) * intensity/100) + restingHR;
        System.out.println(intensity + "%          |" + TargetHeartRate + " bpm");

    }

}
