package ex_05__TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {
        int bill = 100;
        float GST = 18.45f;
//        int total = course+GST; // Narrow - Implicit
        int total1 = bill+(int)GST; // Narrow - Explict
        System.out.println(total1);

        float total2 = bill+GST; // Widening - auto - implicit
        float total3 = (float)bill+GST; // Widening  - Explicit
        System.out.println(total2);
        System.out.println(total3);


    }
}
