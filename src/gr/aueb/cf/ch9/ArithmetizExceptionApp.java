package gr.aueb.cf.ch9;


import java.util.Scanner;

public class ArithmetizExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator;
        int denominator;
        int result = 0;

        try {
            System.out.println("Please insert two ints for division");
            numerator = in.nextInt();
            denominator = in.nextInt();



            result = numerator / denominator;
        } catch (ArithmeticException e) {
           // e.printStackTrace();
            System.out.println("Λάθος παρανομαστής");
        }

       // System.out.printf("%d / %d = %d", numerator, numerator, result);

    }

}
