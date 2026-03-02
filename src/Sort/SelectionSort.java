package Sort;

public class SelectionSort {
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i];
            int minindex = i;
            for (int j = i; j < a.length - 1; j++) {
                if(a[j] < min) {
                    min = a[j];
                    minindex = j;
                }
            }
            a[minindex] = a[i];
            a[i] = min;
        }
    }
}
