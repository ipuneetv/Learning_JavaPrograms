package ex_05__TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
    long phone_no = 9876543210l;
    //short s = phone_no; // implicit ?
    short s = (short) phone_no; // Explicit Casting - Narrowing
    System.out.println(s);

}
}
