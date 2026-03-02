package Sort;

import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }

        int[] counts = new int[max + 1];

        for (int e : array) {
            counts[e]++;
        }
        System.out.println("counts: " + Arrays.toString(counts));

        int index = 0;
        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i]; j++) {
                array[index] = i;
                index++;
            }
        }
    }
}
