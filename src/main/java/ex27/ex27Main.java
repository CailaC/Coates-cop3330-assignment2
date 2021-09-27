/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caila Coates
 */
package ex27;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ex27Main {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter the last name: ");
        String lastName = input.nextLine();
        System.out.println("Enter the ZIP code: ");
        String ZIP = input.nextLine();
        System.out.println("Enter the employee ID: ");
        String ID = input.nextLine();

        validateInput(firstName, lastName, ZIP, ID);
    }

    public static boolean validateFirstName(String firstName){
        boolean isValid = true;

        if(firstName.length() < 2) {
            System.out.println("The first name must be at least 2 characters long.");
            isValid = false;
        }
        if(firstName.length() == 0){
            System.out.println("The first name must be filled in.");
            isValid = false;
        }
        return isValid;
    }

    public static boolean validateLastName(String lastName){
        boolean isValid = true;

        if(lastName.length() < 2) {
            System.out.println("The last name must be at least 2 characters long.");
            isValid = false;
        }
        if(lastName.length() == 0){
            System.out.println("The last name must be filled in.");
            isValid = false;
        }
        return isValid;
    }

    public static boolean validateZIPCode(String ZIP){
        boolean isValid = true;

        try {
            int number = Integer.parseInt(ZIP);
            if (ZIP.length() != 5) {
                System.out.println("The zipcode must be a 5 digit number.");
                isValid = false;
            }
        } catch (Exception e) {
            System.out.println("The zipcode must be a 5 digit number.");
            isValid = false;
        }
        return isValid;
    }

    public static boolean validateEmployeeID(String ID){
        String pattern = "[a-zA-Z]{2}[-]{1}[0-9]{4}";// two letters, a hyphen, and four numbers.
        if (!Pattern.matches(pattern, ID )) {
            System.out.println("The employee ID must be in the format of AA-1234.");
            return false;
        }
        return true;
    }

    public static void validateInput(String firstName, String lastName, String zip, String employeeID) {
        boolean first = validateFirstName(firstName);
        boolean last = validateLastName(lastName);
        boolean zipFlag = validateZIPCode(zip);
        boolean idFlag = validateEmployeeID(employeeID);
        if (first && last && zipFlag && idFlag) {
            System.out.println("There were no errors found.");
        }

    }

}
