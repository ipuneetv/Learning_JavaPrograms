package Extra;

import java.util.Scanner;

public class Extra_011_Pallindrome {
    //  Array of Char

    public static void main(String[] args) {
        // madam -> madam, naman -> reveser(naman) ->

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input, I will check Palindrome");
        String userInput = sc.next();
        String newString = reverseString(userInput);
        if (newString.equalsIgnoreCase(userInput)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");

        }


    }

    private static String reverseString(String userInput) {
        String reversed = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversed = reversed + userInput.charAt(i);
        }

        return reversed;
    }

    private static String reverseStringSB(String userInput) {
        StringBuilder stringBuilder = new StringBuilder(userInput);
        return stringBuilder.reverse().toString();
    }


}
