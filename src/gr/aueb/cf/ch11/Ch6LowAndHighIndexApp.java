package gr.aueb.cf.ch11;

/**
 * Assume an array : { 1, 2, 3, 5, 5, 6, 8, 8, 9, 10}
 *the app returns the low and high index for a key (integer key)
 * tha is included int the array if the key was 8 the algorithm
 * should return {7, 9} or {8, 10} if we make a tine user-friendly optimization
 */
public class Ch6LowAndHighIndexApp {

    public static void main(String[] args) {

    }

    public static int[] getLowAndHighIndexOf (int[] arr, int key) {
        int low = 0;
        int high = 0;
        int pivot;

        if (arr == null) return new int[] {};

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key) {
                low = i;
                break;
            }
        }
        high = low;
        pivot = low + 1;
        while (pivot < arr.length && arr[pivot++] == key) {
            high++;
        }
        return new  int[] {low, high};
    }
}
