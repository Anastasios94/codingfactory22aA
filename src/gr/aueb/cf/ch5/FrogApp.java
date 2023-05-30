package gr.aueb.cf.ch5;

/**
 * Ενας μικρος βατραχος θελει να περασει ενα ποταμι
 * ο frog βρισκεται στην θεση X και θελει να φτασει στη θεση
 * Y (η σε θεσε > Y). Ο frog jumps a fixed distance, D
 *
 * Βρικσει τον ελαχιστο αριθμο jumps που ο μικρος βατραχος
 * πρεπει να κανει
 * ωστε να φτασει στο στοχο του η να τον ξεπερασει
 *
 * ΠΧ:
 * X =10
 * Y = 85
 * D = 30
 *
 * τοτε ο small frog θα χρειαστει 3 jumps, γιατι:
 * Starts at 10 , και μετα το 1ο jump παει στη θεση 10 + 30 = 40
 * στο  2ο jump, παει 40 + 30 = 70
 * και στο 3ο jump, παει 70 + 30 = 100
 *
 */
public class FrogApp {

    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;
        int jumps = 0;

       jumps = (int) Math.ceil((Y - X) / (double) D);
    }
}
