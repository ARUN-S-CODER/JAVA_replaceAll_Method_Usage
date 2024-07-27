package Predefined_Character_Classes;

public class Replace_all_non_alphanumeric_and_underscore_sym {
    /*
     * "\\W" is used to remove all the characters other than underscore symbols and
     * alphanumeric characters in the string.
     */
    public static void main(String[] args) {
        String strval = "Hello 1st person_bye #$ good evening my mam%";
        System.out.println(strval.replaceAll("\\W", "#"));
        // OUTPUT: Hello#1st#person_bye####good#evening#my#mam#
        System.out.printf("%s=%s", strval.substring(9, 25), strval.substring(9, 25).replaceAll("\\W", "/"));
        // OUTPUT: person_bye #$ g=/person_bye////g
    }
}
