/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caila Coates
 */
package ex30;

public class ex30Main {
    public static void main(String[] args) {
        int tableSize = 12;
        MultiplicationTable(tableSize);
    }

    public static void MultiplicationTable(int tableSize) {

        for(int i = 1 ;i<=tableSize;i++) {
            for(int j=1;j<=tableSize;j++) {
                System.out.format("%4d",i*j);
            }
            System.out.println();
        }
    }
}
