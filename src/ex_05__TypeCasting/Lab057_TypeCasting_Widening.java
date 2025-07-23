package ex_05__TypeCasting;

public class Lab057_TypeCasting_Widening {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid syntax -> smaller data into the bigger data type
        // Implicit - Casting - Widening
        System.out.println(a);
        System.out.println(b);
    }
}
