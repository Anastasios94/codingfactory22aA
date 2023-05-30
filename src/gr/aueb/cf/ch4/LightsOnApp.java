package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 *Αποφασιζει αν πρεπει να αναψουν τα φωτα ενος αυτοκινητου
 * με βαση 3 μεταβλητες:αν βρεχει και ταυτοχρονα ισχυει ενα τουλαχιστον απο τα επομενα
 * ειναι σκοταδι η τεχουμε (speed>100).Τις τιμες τις λαμβανουμε απο τον χρηστη(standard input)
 *
 */
public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;
        final int MAX_SPEED = 100;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark (true/false)");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed (int)");
        speed = in.nextInt();

        isRunning = (speed > MAX_SPEED);
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights on: " + lightsOn);
    }
}
