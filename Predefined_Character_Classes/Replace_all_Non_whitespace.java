package Predefined_Character_Classes;

public class Replace_all_Non_whitespace {
    /*
     * "\\S" is used to remove all the characters other than whitespace
     * characters in the given string.
     */
    public static void main(String[] args) {
        String strval = "Hello wor ld good bye";
        System.out.println(strval.replaceAll("\\S", "X"));
        // OUTPUT: XXXXX XXX XX XXXX XXX
        System.out.println(strval.replaceAll("\\S", "@#"));
        // OUTPUT: @#@#@#@#@# @#@#@# @#@# @#@#@#@# @#@#@#
    }
}
