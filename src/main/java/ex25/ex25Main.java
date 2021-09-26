package ex25;

import java.util.Scanner;

public class ex25Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password to check password strength: ");
        String password = input.next();

        System.out.println(password + ": " + calculatePasswordStrength(password));
    }


    public static boolean calculatePasswordStrength(String password) {

        if(password.length() > 8) {
            for (char c : password.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
        }
        return true;
    }

}