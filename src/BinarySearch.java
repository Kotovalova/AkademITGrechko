public class BinarySearch {
   public static int binarySearch(int[] a, int x) {
        if (a == null) return -1;
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (a[middle] == x) {
                return middle;
            } if (x > a[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

        }
        return -1;
    }
}
