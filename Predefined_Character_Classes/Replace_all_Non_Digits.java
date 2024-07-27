package Predefined_Character_Classes;

public class Replace_all_Non_Digits {
    /*
     * "\\D" is used to remove all the characters other than numeric character in
     * the given string.
     */
    public static void main(String... args) {
        String strVal = "HELLO 1234 PERSON";
        System.out.println(strVal.replaceAll("\\D", "X"));
        // OUTPUT: XXXXX1234XXXXXX
        String strVal1 = "Good morning boys time is 10 and we need to go at 11";
        System.out.println(strVal1.replaceAll("\\D", ""));
        // OUTPUT: 1011
        String strVal2 = strVal.substring(0, 5) + " " + strVal1.substring(26, 35);
        System.out.println(strVal2.replaceAll("\\D", "#"));
        // OUTPUT: ######10#######
    }

}
