package Predefined_Character_Classes;

public class Replace_all_whitespace {
    /*
     * "\\s" is used to remove all the whitespace
     * characters in the given string.
     */
    public static void main(String[] args) {
        String str1 = new String("HELLO  GF H OW A R E");
        System.out.println(str1.replaceAll("\\s", ""));
        // OUTPUT: HELLOGFHOWARE
        String str2 = "HELLO GF HOW ARE YOU";
        System.out.println(str2.replaceAll("\\s", "_"));
        // OUTPUT: HELLO_GF_HOW_ARE_YOU
    }

}
