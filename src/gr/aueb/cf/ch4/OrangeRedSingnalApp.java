package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ενα αεροσκαφος εχει 2 δεξαμενες αν μια δεξαμενη εχει
 * λιγοτερο απο 1/4 καυσιμα τοτε αναβει πορτοκαλι σημα
 * ενω αν και οι 2 εχυν < 1/4 τοτε αναβει κοκκινο σημα
 * Ο πιλοτος (χρηστης) δινει true η false
 * αναλογα αν tank < 1/4 η οχι, αντιστοιχα
 */
public class OrangeRedSingnalApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1LessThanQuarter = false;
        boolean isTank2LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if tank1, tank2 are less than 1/4");
        isTank1LessThanQuarter = in.nextBoolean();
        isTank2LTQuarter = in.nextBoolean();

        orangeOn = isTank1LessThanQuarter || isTank2LTQuarter;
        redOn = isTank1LessThanQuarter && isTank2LTQuarter;

        System.out.println("Orange on: "+ orangeOn);
        System.out.println("Red on:"+ redOn);
    }
}
