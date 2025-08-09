package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {

        // String - 90%
        String s0 = "Puneett";
        String s1 = new String("Puneett");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Puneett");
        StringBuilder stringBuilder = new StringBuilder("Puneett");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);





    }
}

