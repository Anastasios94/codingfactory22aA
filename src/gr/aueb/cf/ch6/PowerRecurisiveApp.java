package gr.aueb.cf.ch6;


/**
 * ipologizei to a^n anadromika.
 */
public class PowerRecurisiveApp {

    public static void main(String[] args) {

    }

    public static float power(float a, float n) {
        if (n < 0){
            return 1 / power(a,-n);
        }
        if (n == 0) return 1;

        return a* power(a, n-1);

    }

}
