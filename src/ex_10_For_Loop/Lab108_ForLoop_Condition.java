package ex_10_For_Loop;

public class Lab108_ForLoop_Condition {
    public static void main(String[] args) {
        int i = 10; // initialization outside for loop expression is possible, only intialization can be done outside
        for (; i > 0; i--) {
            System.out.println(i);
        }
    }
}
