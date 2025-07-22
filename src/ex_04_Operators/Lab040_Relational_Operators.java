package ex_04_Operators;

public class Lab040_Relational_Operators {
    public static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // Imp : All of them will result boolean output.

        int a = 10;
        int b = 30;
        boolean c = a > b; // // 10> 30
        System.out.println(c);

        int age_swapnil = 33;
        int age_puneett = 34;
        boolean result = age_puneett >= age_swapnil;
        System.out.println(result);
        // age_puneett > age_swapnil or age_puneett = age_swapnil

    }
}
