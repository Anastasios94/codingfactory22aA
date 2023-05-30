package gr.aueb.cf.ch4;

/**
 * Υπολογιζει το αθροισμα και το γινομενο των 10 πρωτων ακεραιων
 */
public class SumAndMull10App {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        int i = 1;

        while (i <= 10) {
            sum += i;
            mul *= 1;
            i++;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + mul);



    }
}
