package gr.aueb.cf.ch9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyResourceApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        try {
            num= in.nextInt();
            System.out.println(num);
        }catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {

                in.close();


        }


    }

}
