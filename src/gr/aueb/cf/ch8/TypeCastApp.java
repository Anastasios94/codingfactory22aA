package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * typecast from string to int
 */
public class TypeCastApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lexeme;
        int num;

        System.out.println("Please insert a num (int)");
        lexeme = in.next();
        num = Integer.parseInt(lexeme);

        System.out.println("Num is " + num);
    }
}
