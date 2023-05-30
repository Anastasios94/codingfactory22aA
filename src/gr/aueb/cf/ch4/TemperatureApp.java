package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Αποφασιζει αν χιονιζει με βαση την θερμοκρασια
 * αν η θερμοκρασια ειναι ,0,τοτε χιονιζει,αλλιως
 * δε χιονιζει Ο χρηστης δινει θερμοκρασια
 */
public class TemperatureApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        isSnowing = (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
