import java.util.Arrays;

public class Array {

    public static void toUpperArray(String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = inputArray[i].toUpperCase();
        }
    }

    public static double averageOfEvenNumbers(int[] input) {
        int sum = 0;
        int denominator = 0;
        double result = 0.0;
        for (int j : input) {
            if (j % 2 == 0) {
                sum = sum + j;
                denominator++;
            }
        }
        if (denominator != 0) {
            result = (double) sum / denominator;
        }
        return result;
    }

    public static void revertArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    // проверка на сортировку по возрастанию
    public static boolean isSortedAscending(int[] input){
        for (int i = 0; i < input.length-1; i++) {
            if (input[i+1] < input[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // «Массив строк в верх. рег»
        String[] s = {"тетрадь", "Альберт", "КРАСота", "love" };
        System.out.println(Arrays.toString(s));
        Array.toUpperArray(s);
        System.out.println(Arrays.toString(s));

        // «Среднее арифм. массива»
        int[] a = {-10,9,0,15,12,3,18};
        System.out.println(Array.averageOfEvenNumbers(a));

        // «Разворот массива»
        int[] b = {-10,9,0,15,12,3,18};
        Array.revertArray(b);
        System.out.println(Arrays.toString(b));

        // «Проверка сортировки по возрастанию»
        System.out.println("Сортируем массив: " + Arrays.toString(b));
        System.out.println("Массив отсортирован по возрастанию: " + Array.isSortedAscending(b));
        int[] c = {-10,0,0,15,15,23,48};
        System.out.println("Сортируем массив: " + Arrays.toString(c));
        System.out.println("Массив отсортирован по возрастанию: " + Array.isSortedAscending(c));

        // Бинарный поиск - поиск индекса в отсортированном массиве
        int[] d = {1,15,14,22,34,37,40};
        int index = BinarySearch.binarySearch(d, 5);
        System.out.println(index);
        int index2 = BinarySearch.binarySearch(d, 37);
        System.out.println(index2);



    }

}
