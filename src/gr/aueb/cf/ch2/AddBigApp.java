package gr.aueb.cf.ch2;


import java.math.BigInteger;

public class AddBigApp {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("214500600700800");
        BigInteger bigNum2 = new BigInteger("214500600700800");
        BigInteger result = bigNum1.add(bigNum2);

        System.out.printf("%,d" + result);

    }
}
