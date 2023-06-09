package gr.aueb.cf.ch7;

/**
 * Αναζητα το ελαχιστο και μεγιστο στοιχειο ενος πινακα
 */
public class ArrayMinMaxApp {

    public static void main(String[] args) {
        int[] arr = {30, 12, 80, 7, 15};

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[minPosition];
            }
        }

        System.out.printf("Min Value: %d, Min Position: %d", minValue, minPosition + 1);
    }
}
