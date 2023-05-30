package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Διαβαζει εναν char με Scanner
 */
public class CharScannerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar;

        inputChar = in.next().charAt(0);

        System.out.println("Char: "+ inputChar);
    }
}
