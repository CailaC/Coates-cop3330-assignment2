/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caila Coates
 */
package ex38;

import java.util.Scanner;
import java.util.ArrayList;

public class ex38Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numbers = input.nextLine();


        String numArray[] = numbers.split(" ");
        Integer evenArray[] = filterEvenNumbers(numArray);

        System.out.print("The even numbers are ");

        for(int i=0; i<evenArray.length; i++){
            if(i < evenArray.length-1){
                System.out.print(evenArray[i] + " ");

            } else {

                System.out.print(evenArray[i] + ".");
            }
        }
    }

    public static Integer[] filterEvenNumbers(String Array[]) {
        ArrayList<Integer> newList = new ArrayList<>();

        for(int i=0; i<Array.length; i++){
            int num = Integer.parseInt(Array[i]);

            if(num % 2 == 0){
                newList.add(num);
            }
        }

        Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);

        return arr;
    }

}

