package org.example;

import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        // Loop until the user inputs the number 5
        while (number != 5) {
            System.out.println("Please enter a number:");
            number = scanner.nextInt();
        }

        System.out.println("You entered 5. Program stopping.");
        scanner.close();
    }
}
