package ex_11_While;

import java.util.Scanner;

public class Lab121_While_Imp {
    public static void main(String[] args) {
        // Factorial Program
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.println("Welcome to the Factorial Program\nEnter the no whose factorial you want!"); // Prompt the user for input
        int number = scanner.nextInt(); // Read an integer input from the user

        int factorial = 1; // Initialize the factorial variable to 1
        if (number <= 0) { // Check if the number is less than or equal to 0
            System.out.println(factorial); // If true, print the factorial (which is 1)
        } else {
            // If the number is greater than 0, calculate the factorial
            for (int i = 1; i <= number; i++) { // Loop from 1 to the number
                factorial = factorial * i; // Multiply the current factorial value by i
            }
        }

        System.out.println("Factorial is -> " + factorial); // Print the calculated factorial
    }
}
