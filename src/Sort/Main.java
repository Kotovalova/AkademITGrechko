package Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Сортировка выбором
        int[] masf3 = {1,15,14,22,34,37,40};
        System.out.println("\nСортировка выбором");
        System.out.println("Массив до сортировки: " + Arrays.toString(masf3));
        SelectionSort.selectionSort(masf3);
        System.out.println("Массив после сортировки: " + Arrays.toString(masf3));

        // Быстрая сортировка
        int[] masf = {1,15,14,22,34,37,40};
        System.out.println("\nБыстрая сортировка");
        System.out.println("Массив до сортировки: " + Arrays.toString(masf));
        QuickSort.quickSort(masf);
        System.out.println("Массив после сортировки: " + Arrays.toString(masf));

        // Сортировка пирамидальная
        int[] masf1 = {3,3,2,4,1,6,1,2,3,3,8};
        System.out.println("\nПирамидальная сортировка");
        System.out.println("Массив до сортировки: " + Arrays.toString(masf1));
        PyramidSort.piramidSort(masf1);
        System.out.println("Массив после сортировки: " + Arrays.toString(masf1));

        // Сортировка подсчетом
        int[] masf2 = {3,3,2,4,1,6,1,2,3,3,8};
        System.out.println("\nСортировка подсчетом");
        System.out.println("Массив до сортировки: " + Arrays.toString(masf2));
        CountingSort.countingSort(masf2);
        System.out.println("Массив после сортировки: " + Arrays.toString(masf2));




    }
}