package ex24;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams.");
        System.out.println("Enter the first string: ");
        String string1 = input.next();
        System.out.println("Enter the second string: ");
        String string2 = input.next();

        isAnagram(string1, string2);

        if( isAnagram(string1,string2) ) {
            System.out.println( "\"" + string1 + "\"" + " and " + "\"" + string2 + "\"" + " are anagrams.");
        } else {
            System.out.println( "\"" + string1+ "\"" + " and " + "\""+ string2 + "\""+ " are not anagrams.");
        }


    }


    public static boolean isAnagram(String string1, String string2) {
        // Check if both length matches
        if (string1.length() != string2.length())
            return false;
        else {
            // Convert both Strings into Character Array
            char[] array1 = string1.toCharArray();
            char[] array2 = string2.toCharArray();

            // Sort both Character Array
            Arrays.sort(array1);
            Arrays.sort(array2);

            //see if characters match
            for (int i = 0; i < array2.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}