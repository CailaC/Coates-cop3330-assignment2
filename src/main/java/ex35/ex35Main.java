/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caila Coates
 */
package ex35;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ex35Main {
    public static void main(String[] args){

        buildArray();

    }

    public static void buildArray (){
        Scanner input = new Scanner(System.in);
        ArrayList<String> entriesArray = new ArrayList<String>();

        question();
        String name;

        while(true){
            name = input.nextLine();
            entriesArray.add(name);

            if(name == ""){
                selectWinner(entriesArray);
                break;
            }
            question();
        }
    }

    public static void question(){
        System.out.println("Enter a name: ");
    }

    public static void selectWinner(ArrayList<String> entriesArray){
        Random arrayNum = new Random();
        int randomNumber = arrayNum.nextInt(entriesArray.size());

        String randomElement = entriesArray.get(randomNumber);
        System.out.println("The winner is... " + randomElement + ".");
    }

}
