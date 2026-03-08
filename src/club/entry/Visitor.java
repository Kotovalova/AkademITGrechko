package club.entry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Visitor {

    private String name;
    private int age;
    private String gender;

    public Visitor (String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static Visitor createFromConsole(){
        try (Scanner scanner = new Scanner(System.in)){

            System.out.println("=== Ввод данных посетителя из консоли === ");

            System.out.println("Введите Имя: ");
            String name = scanner.nextLine();

            System.out.println("Введите Возраст: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Введите пол (м/ж): ");
            String gender = scanner.nextLine();
            gender = gender.toUpperCase();

            return new Visitor(name, age, gender);

        } catch (InputMismatchException e) {
            System.err.println("Ошибка: нужно ввести число, а не текст!");
            throw e;
        } catch (Exception e) {
            System.err.println("Ошибка ввода" + e.getMessage());
            throw e;
        }
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getGender(){
        return this.gender;
    }

    public boolean isWoman(){
        return gender.equals("Ж");
    }

}

