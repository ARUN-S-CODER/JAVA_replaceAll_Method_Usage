package Quantifiers;

public class zero_or_one_time_repetition {
    public static void main(String[] args) {
        String st1 = "aababbc";
        System.out.println(st1.replaceAll("a?", "X"));
        // OUTPUT: XXXbXXbXbXcX
        /*
         * (a)=a? where it contains one 'a'
         * now string is Xababbc
         * (a)=a? where it contains one 'a'
         * now string is XXbabbc
         * (b)=a? where it contains zero 'a'
         * now string is XXXbabbc
         * (a)=a? where it contains one 'a'
         * now string is XXXbXbbc
         * (b)=a? where it contains zero 'a'
         * now string is XXXbXXbbc
         * (b)=a? where it contains zero 'a'
         * now string is XXXbXXbXbc
         * (c)=a? where it contains zero 'a'
         * now string is XXXbXXbXbXc
         * ()=a? where it contains zero 'a'
         * now string is XXXbXXbXbXcX
         * hence the output is XXXbXXbXbXcX
         */
        System.out.println(st1.replaceAll("a?b", "X"));
        // OUTPUT: aXXXc
        /*
         * (aa) not satified becoz it has more than one a's
         * so the string remains same but we can consider the last a
         * (ab)=a?b so the string is aXabbc
         * (a)=a? and (ab)=a?b so the string is aXXbc
         * (b)=a? and a?b so the string is aXXXc
         * (c)=a? but a?b not true so string is aXXXc
         * hence the output is aXXXc
         */
        System.out.println(st1.replaceAll("a?ba?", "X"));
        // OUTPUT: aXXXc
        /*
         * (a)=a? true but (aa)!=a? so the string is aababbc
         * (a)=a? true and (ab)=a?b true and (aba)=a?ba? true
         * so the string is aXbbc
         * (b)=a? and (b)=a?b and (b)=a?ba? true
         * so the string is aXXbc
         * (b)=a? and (b)=a?b and (b)=a?ba? true
         * so the strig is aXXXc
         */
    }
}
