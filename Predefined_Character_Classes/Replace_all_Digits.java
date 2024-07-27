package Predefined_Character_Classes;

class demo {
    /*
     * "\\d" is used to remove all the numbers in the given string.
     */
    public static void main(String[] done) {
        String strVal = "HELLO 1234 PERSON";
        System.out.println(strVal.replaceAll("\\d", ""));
        // OUTPUT: HELLO PERSON
        String strVal1 = "Good morning boys time is 10 and we need to go at 11";
        System.out.println(strVal1.replaceAll("\\d", "0"));
        // OUTPUT: Good morning boys time is 00 and we need to go at 00
        String strVal2 = strVal + " " + strVal1.substring(26);
        System.out.println(strVal2.replaceAll("\\d", "(X-digit)"));
        /*
         * OUTPUT: HELLO (X-digit)(X-digit)(X-digit)(X-digit) PERSON (X-digit)(X-digit)
         * and we need to go at (X-digit)(X-digit)
         */
    }
}