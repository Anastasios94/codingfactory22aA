package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Προσθετει και πολλαπλασιαζει
 * n πρωτους ακεραιους.Το n το δινει
 * ο χρηστης.
 */
public class AddMullApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        int result =1;

        System.out.println("Please insert a num (int)");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
            result *= i;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Mul = " + result);
        System.out.printf("Mul: %,d", result);
    }
}
