package Anchors;

public class end_string_pattern {
    public static void main(String[] args) {
        String strval = "Happy Journey";
        System.out.println(strval.replaceAll("ney$", "+"));
        // OUTPUT: Happy Jour+
        /*
         * since the string ends with 'ney' therefore it is replacement as '+'
         * so the output is Happy Jour+
         */
        System.out.println(strval.replaceAll("y$", "y Friends"));
        // OUTPUT: Happy Journey Friends
        /*
         * since the string ends with 'y'
         * so 'y Friends' string is replaced in that position
         * so the output is Happy Journey Friends
         */
    }
}
