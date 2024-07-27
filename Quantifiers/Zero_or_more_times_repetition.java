package Quantifiers;

public class Zero_or_more_times_repetition {
    /*
     * "*" is used to replace a character which occurs zero or more times.
     */
    public static void main(String[] args) {
        String str1 = "aabbc";
        String str2 = "aabbcccdd";
        System.out.println(str1.replaceAll("a*", "X"));
        // OUTPUT: XXbXbXcX
        /*
         * (aa)=a* where two a's are presented.
         * now string is Xbbc
         * ()=a* where zero a's are presented.
         * now string is XXbbc
         * (b) does not satisfy the pattern (a*)
         * after b, there is 0 a's so it is replaced by X
         * now the string is XXbXbc
         * (b) does not satisfy the pattern (a*)
         * after b, there is 0 a's so it is replaced by X
         * now the string is XXbXbXc
         * (c) does not satisfy the pattern (a*)
         * after c, there is 0 a's so it is replaced by X
         * now the string is XXbXbXcX
         * hence the output is XXbXbXcX
         */
        System.out.println(str1.replaceAll("a*b", "="));
        // OUTPUT: ==c
        /*
         * (aa)=a* where two a's are present
         * (aab)=a*b where two a's with one b is presented.
         * so (aab) is replaced by =
         * now string is =bc
         * (b)=a* where zero a's are present
         * (b)=a*b where zero a's with one b is presented.
         * so (b) is replaced by =
         * now string is ==c
         * (c)=a* where zero a's are present.
         * but a*b is not satisfied becoz there is no one b with a's
         * hence the output is ==C
         */
        System.out.println(str2.replaceAll("a*b*c*d*", "Y"));
        // OUTPUT: YY
        /*
         * (aa)=a* where two a's are present
         * (aab)=a*b where two a's with one b is presented.
         * (aabb)=a*b* where two a's with two b's are presented.
         * (aabbc)=a*b*c where two a's and two b's with one c is presented.
         * (aabbccc)=a*b*c*
         * ---where two a's and two b's and three c's is presented.
         * (aabbcccd)=a*b*c*d
         * ---where two a's,two b's,three c's and one d is presented.
         * (aabbcccdd)=a*b*c*d*
         * ---where two a's,two b's,three c's and two d's is presented.
         * so (aabbcccdd) is replaced by Y
         * now string is Y
         * ()=a*b*c*d*
         * ---where 0 a's, 0 b's, 0 c's and 0 d's is presented.
         * so () is replaced by Y
         * now string is YY
         * hence the output is YY
         */
    }
}
