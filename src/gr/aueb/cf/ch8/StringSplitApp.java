package gr.aueb.cf.ch8;

/**
 * splits a string
 */
public class StringSplitApp {

    public static void main(String[] args) {
        String s = "Athens Uni of econ and business";

        String[] tokens = s.split(" ");

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
