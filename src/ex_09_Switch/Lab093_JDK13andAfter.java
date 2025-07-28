package ex_09_Switch;

public class Lab093_JDK13andAfter {
    public static void main(String[] args) {
        // in JDK > 13
        int itemCode = 001;
        switch (itemCode){
            case 001 -> System.out.println("Item 001"); //No break statement is required
            case 002 -> System.out.println("Item 002");
            case 003 -> System.out.println("Item 003");
            default -> System.out.println("Item Default");
        }
    }

    public static class Java_JDJ13 {
    }
}
