package Predefined_Character_Classes;

class Replace_all_alphanumeric_and_underscore_sym {
    /*
     * "\\w" is used to remove all the underscore symbols and alphanumeric
     * characters in the string.
     */
    public static void main(String[] args) {
        String strval = "Hello 1st person_bye #$ good evening my mam%";
        System.out.println(strval.replaceAll("\\w", "A"));
        // OUTPUT: AAAAA AAA AAAAAAAAAA #$ AAAA AAAAAAA AA AAA%
        System.out.printf("%s=%s", strval.substring(9, 25), strval.substring(9, 25).replaceAll("\\w", "/"));
        // OUTPUT: person_bye #$ g= ////////// #$ /
    }
}
