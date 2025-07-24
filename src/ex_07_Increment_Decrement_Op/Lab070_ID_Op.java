package ex_07_Increment_Decrement_Op;

public class Lab070_ID_Op {
    public static void main(String[] args) {
        // pre - increment -> ++operand.
        // value is incremented first and then stored in the result.
        // value increased by 1
        int a = 10;
        int b = ++a; // 10+1 -> b -> 11
        System.out.println(b); // 11
        System.out.println(a); // 11

        //  Exp and Result Table

        // Line No | a | Result b
        // 8 | 10 | NA
        // 9 | 11 | 11
        // 10 | 11(NA) | 11
        // 11 | 11 | 11(NA)
    }
}