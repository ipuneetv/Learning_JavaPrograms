package ex_06_Ternary_Operator;

public class Lab062_TO {
    public static void main(String[] args) {
        // ? :  --- it is conditional statement of if and else in a single line
        int age = 10;
        int puneetts_age =18;

        String canIVote  =  age >=18 ? "Yes, You can Vote" : "No You can't Vote";
        String canPuneettVote  =  puneetts_age >=18 ? "Yes, You can Vote" : "No You can't Vote";

        System.out.println(canIVote);
        System.out.println(canPuneettVote);


    }
}
