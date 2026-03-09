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

    public static Visitor createFromConsole() throws VisitorExeption{
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("=== Ввод данных посетителя из консоли === ");

            String name = ConsoleReader.readName(scanner);
            int age = ConsoleReader.readAge(scanner);
            String gender = ConsoleReader.readGender(scanner);

            return new Visitor(name, age, gender);

        } catch (InputMismatchException e) {
            throw e;
        } catch (Exception e) {
            System.err.println("Ошибка ввода. " + e.getMessage());
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
        return gender.equals("ж")||gender.equals("w");
    }

}

