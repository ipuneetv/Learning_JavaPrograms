package ex_06_Ternary_Operator;

public class Lab064_Nested_TO {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        int number = 25;
        String result = (number > 10) ? (number > 20 ? "N>10" : "N<20") : "B";
        System.out.println(result);

    }
}
