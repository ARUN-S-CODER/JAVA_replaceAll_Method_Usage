public class Replace_NCharacter {
    public static void main(String[] args) {
        String strVal = "abc23a4bc6kc";
        System.out.println(strVal + " changes to " + strVal.replaceAll("[abc]", "X"));
        // OUTPUT: abc23a4bc6kc changes to XXX23X4XX6kX
        System.out.println(strVal + " changes to " + strVal.replaceAll("[^abc]", "X"));
        // OUTPUT: abc23a4bc6kc changes to abcXXaXbcXXc

        /*
         * TASK: Remove all the vowels from given String. And print consonents alone as
         * output.
         */

        System.out.println(
                "Consonents present in this string " + strVal + " are " + strVal.replaceAll("[aeiouAEIOU]", ""));
        // OUTPUT: Consonents present in this string abc23a4bc6kc are bc234bc6kc
        System.out
                .println("Vowels present in this String " + strVal + " are " + strVal.replaceAll("[^aeiouAEUIO]", ""));
        // OUTPUT: Consonents present in this string abc23a4bc6kc are aa
    }

}