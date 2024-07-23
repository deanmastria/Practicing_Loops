package org.example;

import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Prompt the user to enter a number less than 11
        System.out.println("Enter a number less than 11:");
        number = scanner.nextInt();

        // Check if the number is less than 11
        if (number >= 11) {
            // Prints if the number is not less than 11
            System.out.println("The number must be less than 11.");
        } else {
            // Use a for loop to print numbers from the user's input up to 11
            for (int i = number; i <= 11; i++) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
