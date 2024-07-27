package Anchors;

public class start_string_pattern {
    public static void main(String[] args) {
        String str = "college student";
        System.out.println(str.replaceAll("^col", "---"));
        // OUTPUT: ---lege student
        /*
         * since the string starts with 'col' therefore it is replaced as '---'
         * so the output is ---lege student
         */
        System.out.println(str.replaceAll("^colg", "--"));
        // OUTPUT: college student
        /*
         * since the string doesnot starts with 'colg'
         * therefore the condition falses hence replacement will not be done
         */
    }
}
