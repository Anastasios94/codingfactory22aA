package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * lambani enan bathmo apo ton xristi kai dini feedback me tin morfi ecxelent very good good fail
 * an einai to grade >=8 >=9 >=7 >=5 antistixa
 */
public class SwitchFallThrough {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade;
        System.out.println("Please provide the grade");
        grade = in.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Fail");
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very good");
            case 9:
            case 10:
                System.out.println("Excellent");
            default:
                System.out.println("Error in grade");
                break;
        }
    }
}
