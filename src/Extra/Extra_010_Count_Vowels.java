package Extra;

public class Extra_010_Count_Vowels {
    public static void main(String[] args) {
        String input = "Java Program to Count Vowels and Consonants";
        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();
        System.out.println(input);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }


        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);


    }
}
