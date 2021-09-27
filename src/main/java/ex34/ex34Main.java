/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caila Coates
 */
package ex34;

import java.util.Scanner;

public class ex34Main {

    public static void main(String[] args){

        employeeList();

    }

    public static void employeeList(){
        Scanner input = new Scanner(System.in);
        String[] employeeArray = {"Caila Coates", "Amanda Smith", "Tyler Johnson", "Tim Cooke", "Mia Allen"};
/*
        int arrayLength = employeeArray.length;

        System.out.println("There are " + arrayLength + " employees:");
        for(int i = 0; i < arrayLength; i++){
            System.out.println(employeeArray[i]);
        }

*/
        printList(employeeArray);

        System.out.println("\nEnter an employee name to remove: ");
        String employeeRemoved = input.nextLine();


        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].equals(employeeRemoved)) {
                //employeeArray[i] = null;
                myArrayList.remove(stringToRemove);
                break;
            }
        }

        printList(employeeArray);

    }

    public static void printList(String[] arr){
        Scanner input = new Scanner(System.in);

        int arrayLength = arr.length;

        System.out.println("There are " + arrayLength + " employees:");
        for(int i = 0; i < arrayLength; i++){
            System.out.println(arr[i]);
        }
    }
}
