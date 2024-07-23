package org.example;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //stores users input
        int number;

        //start loop
        while (true) {
            //prompts user to enter number
            System.out.println("Enter a number:");
            //reads and stores integer
            number = scanner.nextInt();

            //checks if the number is less than zero
            if (number < 0) {
                System.out.println(number + " must be a positive number");
            //checks if number is equal to zero
            } else if (number == 0) {
                System.out.println(number + " this program has ended");
                //exits loop if number is zero
                break;
                //prints if number is positive
            } else {
                System.out.println("Number is " + number);
            }
            }

        scanner.close();
        }
    }

