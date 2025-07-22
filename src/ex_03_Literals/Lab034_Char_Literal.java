package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {

        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        //char c2 = "A"; // this is not a char, it is string, in "" it is a string
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space is also a character


        // Escape Char
        char new_line = '\n'; // means new line - mostly this is used
        char tab_line = '\t'; // means tab, adds space
        char back_space = '\b'; // means back space, deletes one character
        char carriage_return = '\r'; // means to delete the first word

//        System.out.println("PramodDutta");
        System.out.println("Pramod"+new_line+"Dutta");
        System.out.println("Pramod"+tab_line+"Dutta");
        System.out.println("Pramod"+back_space+"Dutta");
        System.out.println("Pramod is old"+carriage_return+"Dutta");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");

        char c10 = 'A';
        //  when C or C++ was started, they had limited number of ASCII values,
        //  They created ASCII system but with (limited numbers)
        //  Char - A has ASCII value of -> 65

        char rupees = '₹';
        System.out.println(rupees);
        char rupee_symbol_unicode = '\u20B9'; // unicode of rupee symbol
        System.out.println(rupee_symbol_unicode);
        char my_laugh_smiley = '\u1f60'; // unicode of smiley || please ignore what is printed, since its intelliJ way of representing smiley, it is a mess
        System.out.println(my_laugh_smiley);

        char c11  = '\u1F60';
        System.out.println(c11);



    }
}
