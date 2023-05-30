package gr.aueb.cf.ch6;

import java.util.Scanner;

public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please insert a,b,c");
         a = in.nextInt();
         b = in.nextInt();
         c = in.nextInt();

         isRight =(Math.abs(a*a - b*b + c*c) <= EPSILON);



    }
}
