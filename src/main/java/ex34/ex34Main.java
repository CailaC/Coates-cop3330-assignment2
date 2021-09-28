/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caila Coates
 */
package ex34;

//import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class ex34Main {

    public static void main(String[] args){

        employeeList();

    }

    public static void employeeList(){
        Scanner input = new Scanner(System.in);
        ArrayList<String> employeeArray = new ArrayList<String>();
        employeeArray.add("Caila Coates");
        employeeArray.add("Amanda Smith");
        employeeArray.add("Tyler Jones");
        employeeArray.add("Mia Allen");
        employeeArray.add("Tim Cooke");
        //String[] employeeArray = {"Caila Coates", "Amanda Smith", "Tyler Johnson", "Tim Cooke", "Mia Allen"};

        printList(employeeArray);

        System.out.println("\nEnter an employee name to remove: ");
        String employeeRemoved = input.nextLine();


      employeeArray.remove(employeeRemoved);

      System.out.println("");
      printList(employeeArray);

    }

    public static void printList(ArrayList<String> employeeArray){
        Scanner input = new Scanner(System.in);

        int arrayLength = employeeArray.size();

        System.out.println("There are " + arrayLength + " employees:");
        for(int i = 0; i < arrayLength; i++){
            System.out.println(employeeArray.get(i));
        }
    }
}
