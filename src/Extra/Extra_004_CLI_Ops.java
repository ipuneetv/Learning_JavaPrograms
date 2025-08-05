package Extra;

public class Extra_004_CLI_Ops {
    public static void main(String[] args) {
        // CLI Options
        //
        //Take a user input - Name, Age and Salary and print them in the end.
        //
        //Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.

        System.out.println("Enter the name, age and Salary");
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);





    }
}
