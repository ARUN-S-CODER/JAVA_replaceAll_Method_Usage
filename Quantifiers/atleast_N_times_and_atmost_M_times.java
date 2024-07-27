package Quantifiers;

public class atleast_N_times_and_atmost_M_times {
    public static void main(String[] args) {
        String strval = "aaaabaanaaama";
        System.out.println(strval.replaceAll("a{2,3}", "L"));
        // OUTPUT: LabLnLma
        /*
         * aaaa in this it contains 4 a's but we can replace atmost 3 a's so it replaced
         * as La
         * b remains same
         * aa is replaced as L
         * n remains same
         * aaa is replaced as L
         * m remains same
         * a is reamins same becoz it does not satisfy atmost 3 a's or atleast 2 a's
         * condition.
         * so the output is LabLnLma
         */
    }
}
