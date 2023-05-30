package gr.aueb.cf.ch10;

import java.util.Scanner;

public class ProxiroApp {

    public static void main(String[] args) {
        int[] arr = {7, 6, 6, 10, 2, 7, 9};
        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[minPosition];
            }
        }

        System.out.printf("Min value: %d, Min Position: %d", minValue, minPosition + 1);
    }

    }
