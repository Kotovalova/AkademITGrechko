package Sort;

public class QuickSort {
    public static void quickSort(int[] a) {
        if (a == null || a.length <= 1) return;
        quickSort(a,0, a.length - 1);
    }

    public static void quickSort(int[] a, int left, int right) {
        if (left >= right) return;

        int x = a[left];
        int i = left + 1;
        int j = right;

        while (i <= j){
            while (a[i] <= x && i <= right){
                i++;
            }
            while (a[j] >= x && j >= left + 1){
                j--;
            }
            if (j >= i){
                int vr = a[j];
                a[j] = a[i];
                a[i] = vr;
                i++;
                j--;
            } else break;
        }
        int vr = a[j];
        a[j] = a[left];
        a[left] = vr;
        if (i < right) quickSort(a,i,right);
        if (j > left) quickSort(a,left,j);
    }
}
