public class Find_shortform_of_given_string {
    public static void main(String[] args) {
        String st = "World Health Organization";
        String st2 = " Computer Science and Business Systems 123";
        System.out.println(st.replaceAll("\\B.|\\P{L}", ""));
        // OUTPUT: WHO
        System.out.println(st.replaceAll("[a-z]", ""));
        // OUTPUT: W H O
        System.out.println(st2.replaceAll("[a-z]", ""));
        // OUTPUT: C S B S 123
        /*
         * But the shortform does not contain numeric values and whitespaces.
         */
        System.out.println(st2.replaceAll("[a-z]", "").replaceAll("\\d", ""));
        // OUTPUT: C S B S
        /*
         * Still whitespace are available.
         */
        System.out.println(st2.replaceAll("[a-z]", "").replaceAll("\\d", "").replaceAll("\\s", ""));
        // OUTPUT: CSBS
    }
}
