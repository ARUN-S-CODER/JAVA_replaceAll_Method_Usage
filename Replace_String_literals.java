public class Replace_String_literals {
    public static void main(String[] args) {
        String strVal = new String("Today is so bad for me");
        String newStrVal = strVal.replaceAll("Today", "Tonight");
        String newStrVal1 = strVal.replaceAll("bad", "good");
        String newStrVal2 = newStrVal1.replaceAll("Today", "Tonight");
        System.out.println("The String is changed from \"" + strVal + "\" to \"" + newStrVal + "\"");
        /*
         * OUTPUT: The String is changed from "Today is so bad for me" to "Tonight is so
         * bad for me"
         */
        System.out.println("The String is changed from \"" + strVal + "\" to \"" + newStrVal1 + "\"");
        /*
         * OUTPUT: The String is changed from "Today is so bad for me" to "Today is so
         * good for me"
         */
        System.out.println("The String is changed from \"" + strVal + "\" to \"" + newStrVal2 + "\"");
        /*
         * OUTPUT: The String is changed from "Today is so bad for me" to "Tonight is so
         * good for me"
         */

    }
}
