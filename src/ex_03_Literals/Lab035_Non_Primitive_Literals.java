package ex_03_Literals;

public class Lab035_Non_Primitive_Literals {
    public static void main(String[] args) {
        // Primitive Data Type - Defined by Java Guys
        // Max, Min, Size defined
        // cannot be broken further

        byte b = 10; // 1 Byte -> 8 Bits
        int age = 65; // 4 Byte -> 32 Bits
        System.out.println(b);
        System.out.println(age);

        // Non Primitive ( Defined by users) , Reference Data Types
        // No Size, max, min
        // Byte - 8 , Bits - 64
        String name = "Pramod"; // String is bunch of char.
        int[] arrays_of_items = new int[10];
        // String, Arrays, Classes, enum, interface

        System.out.println(name);
        System.out.println(arrays_of_items);




    }
}
