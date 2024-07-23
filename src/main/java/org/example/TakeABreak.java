package org.example;

import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";

        // Loop until the user inputs "yes"
        while (!answer.equals("yes")) {
            System.out.println("Do you want to take a break?");
            answer = scanner.nextLine();
        }

        System.out.println("Great! Take a break.");
        scanner.close();
    }
}
