package ex_06_Ternary_Operator;

public class Lab065_TO {
    public static void main(String[] args) {
        // Find the maximum number between two numbers.
        int x = 10;
        int y = 20;
        System.out.println(Math.max(x,y));


        int max = x > y ? x : y; // output in integer
        System.out.println(max);

        String max2 = x > y ? "x is max": "y is max"; // output in string
        System.out.println(max2);


}
}
