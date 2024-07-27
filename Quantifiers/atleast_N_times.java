package Quantifiers;

public class atleast_N_times {
    public static void main(String[] args) {
        String strval = "aaaasabaa";
        System.out.println(strval.replaceAll("a{2,}", "L"));
        // OUTPUT: LsabL
        /*
         * since aaaa contains atleast 2 a's therefore it is replaced as L
         * 's' doesnot have any a's so it remains same
         * 'a' doesnot contains enough a's so it remains same
         * 'b' remains same
         * aa contains exactly 2 a's therefore it replaced as L
         */
    }
}
