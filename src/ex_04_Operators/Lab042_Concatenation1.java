package ex_04_Operators;

public class Lab042_Concatenation1 {
    public static void main(String[] args) {
        // concatination
//        System.out.println("Puneett"+ "Verma");

        int a = 10;
        int b = 20;
        System.out.println(a + b); //  if use with integer it will consider as  Math operator and add value

        String name1 = "Puneett";
        String name2 = "Verma";
        System.out.println(name1+name2); // //  if use with string it will combine them

        // + -> behave differently with the data type.
        // + -> This is known as operator overloading, see next example


    }
}
