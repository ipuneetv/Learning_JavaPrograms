package ex_02_Java_Basic_Part2;

public class Lab030_Tables_With_For {
    public static void main(String[] args) {
        int number = 9;
        System.out.println("Table of 9");
        for (int i = 1 ; i <= 10 ; i++) // but we have to do our eercise without for loop
        {
            System.out.printf("%d * %d = %d\n", number, i, number *i);
        }
    }
}
