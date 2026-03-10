import java.util.*;

public class Test {

    private final int WEIGHT = 10;

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Осень");
        a.add("Зима");
        a.add("Лето");
        a.add("Весна");
        boolean isSort = check(a);
        System.out.println("Коллекция была отсортирована?: " + isSort);

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Вася","Гена","Коля"));
        isSort = check(names);
        System.out.println("Коллекция была отсортирована?: " + isSort);
    }

    public static boolean check(ArrayList<String> input){
        List<String> b = new ArrayList<>(input);
        System.out.println("До сортировки: " + b);
        b.sort(null);
        System.out.println("После сортировки: " + b);
        return input.equals(b);
    }
}
