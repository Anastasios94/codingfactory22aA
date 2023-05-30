package gr.aueb.cf.ch6;


/**
 * antallassei amoibaia duo times pou dinei o xrhsths
 *
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);

        System.out.println("a = " + a + "b = " + b);
    }

    /**
     * swaps a,b, s= a -> b, b-> a
     * @param a  the first balue
     * @param b  the second balue
     */
    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;

    }
}
