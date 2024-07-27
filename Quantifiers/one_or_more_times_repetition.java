package Quantifiers;

public class one_or_more_times_repetition {
    /*
     * "+" is used to find one or more repetition specified character.
     */
    public static void main(String[] args) {
        String str1 = "aabbbb";
        System.out.println(str1.replaceAll("a+", "X"));
        // OUTPUT: Xbbbb
        /*
         * here "a+" which means X is replace in the place one or more "a" occurs.
         * (aa)=a+
         */
        System.out.println(str1.replaceAll("a+b", "X"));
        // OUTPUT: Xbbb
        /*
         * here "a+" means one or more "a" occurence.
         * "a+b" menas one or more a's with one b
         * (aab)=a+b
         */
        System.out.println(str1.replaceAll("a+b+", "X"));
        // OUTPUT: X
        /*
         * here "a+" means one or more "a" occurence.
         * here "b+" means one or more "b" occurence.
         * (aa)=a+
         * (bbbb)=b+
         * (aabbbb)=a+b+
         */
    }

}
