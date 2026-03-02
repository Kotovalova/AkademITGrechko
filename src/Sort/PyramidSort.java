package Sort;

import java.util.Arrays;

public class PyramidSort {
    public static void piramidSort(int[] array) {
        if (array == null || array.length <= 1) return;
        int el = array.length/2 - 1;

        // 1. Построение max-кучи
        for (int i = el; i >= 0 ; i--) {
            prosev(array, i, array.length);
        }

        // Обмениваем 0 элемента с последним в куче
        for (int i = 0; i < array.length - 1; i++) {
            obmen(array,0,array.length - 1 - i);
            prosev(array, 0, array.length - 1 - i);
        }

    }

    private static void prosev(int[] array, int i, int heapSize){
        int left = i*2 + 1;
        int right = i*2 + 2;

        boolean hasLeft = left < heapSize;
        boolean hasRight = right < heapSize;

        int maxChild = left;
        if (hasLeft) {
            if (hasRight && array[right] > array[left]){
                maxChild = right;
            }
        } else return;

        if (array[i] < array[maxChild]) {
            obmen(array, i, maxChild);
            prosev(array, maxChild, heapSize);
        }
    }

    private static void obmen(int[] array, int a, int b){
        int vr = array[b];
        array[b] = array[a];
        array[a] = vr;
    }

    public static void main(String[] args) {
        // Сортировка пирамидальная
        int[] masf = {3,3,2,4,1,6,1,2,3,3,8};
        System.out.println("Массив до сортировки: " + Arrays.toString(masf));
        piramidSort(masf);
        System.out.println("Массив после сортировки: " + Arrays.toString(masf));
    }

}
