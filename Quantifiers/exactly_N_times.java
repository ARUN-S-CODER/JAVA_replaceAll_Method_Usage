package Quantifiers;

/*
 * a{3} means if 'a' occurs atleast three times replace that as L.
 */

class Atleast_N_times {
    public static void main(String[] args) {
        String a = "aaabaaaabkaa";
        System.out.println(a.replaceAll("a{3}", "L"));
        // OUTPUT: LbLabkaa
        /*
         * First aaa has three a's therefore it is changed as 'L'
         * now the String is Lbaaaabkaa
         * then 'b' remains same
         * aaaa has more than 3 a's so only first 3 a's are changed into "L" and the
         * fourth a is remains same.
         * now the string is LbLabkaa
         * then there is no 3 a's so all other character will not change.
         * so the final output is LbLabkaa.
         */
    }
}
