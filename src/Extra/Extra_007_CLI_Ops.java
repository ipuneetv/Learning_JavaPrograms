package Tasks;

import java.util.Scanner;

public class Extra_007_CLI_Ops {
    public static void main(String[] args) {
        // Scanner Class
        //
        //Take a user input - Name, Age and Salary and print them in the end.
        //
        //Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Prompt the user for their salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Print the collected information
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        // Close the scanner
        scanner.close();





    }
}
