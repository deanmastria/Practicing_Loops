package org.example;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompts user to enter a number
        System.out.println("Enter the first number: ");
        int number = scanner.nextInt();

        //for loop starting at one until 10, stops at 10
        for (int i = 1; i <= 10;  i++) {
            int result = number * i;
            System.out.println(number + "*" + i + " = " + result);
        }
        scanner.close();
    }
}
