package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Proxiro {

    public static void main(String[] args) {
        int num = 10;
        int result = 15;
        int i = 0;
        do {
            result = result / num;
            i++;
        }  while (result != 0);

        System.out.println(i);
    }
}