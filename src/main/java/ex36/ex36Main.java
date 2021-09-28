/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caila Coates
 */
package ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class ex36Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> numArr = new ArrayList<>();

        double number;
        while (true) {
            System.out.println("Enter a number: ");
            String done;

            if (input.hasNextDouble())
            {
                number = input.nextDouble();
                numArr.add(number);
            }
            else
            {
                if (input.hasNext())
                {
                    done = input.next();

                    if (done.equals("done"))
                    {
                        break;
                    }
                }
                else
                {
                    input.nextLine();
                }
                System.out.println("Input not valid");
            }
        }

        average(numArr);
        max(numArr);
        min(numArr);
        std(numArr);

        }

    public static double average(ArrayList<Double> numArray){
        double sum = 0;
        double avg;

        //I honestly don't know what this is, intellij kept wanting to correct me so, I let them
        for (Double aDouble : numArray) {
            sum = sum + aDouble;
        }
        avg = sum / numArray.size();
        System.out.println("The average is " + avg);

        return sum;
    }


    public static void max(ArrayList<Double> numArray){
        Double max = 0.0;

        for (int i =0; i < numArray.size(); i++) {
            if(numArray.get(i) > max){
                max = numArray.get(i);
            }else
                max = max;

        }

        System.out.println("The max is " + max);

    }

    public static void min(ArrayList<Double> numArray){
        Double min = numArray.get(1);

        for (int i =0; i < numArray.size(); i++) {
            if(numArray.get(i) < min){
                min = numArray.get(i);
            }else
                min = min;

        }

        System.out.println("The min is " + min);

    }

    public static void std(ArrayList<Double> numArray){
        double avg = average(numArray);
        double std = 0;

        for(int i = 0; i < numArray.size(); i++)
        {
            std = std + Math.pow((numArray.get(i) - avg), 2);
        }
        std = Math.sqrt(std / numArray.size());

        System.out.println("The std is: " + std);
    }


}