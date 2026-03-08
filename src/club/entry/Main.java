package club.entry;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

// дописать проверку на корректный ввод возраста и пола

public class Main {
    public static void main(String[] args) {
        try {
            Visitor visitor = Visitor.createFromConsole();
            ClubRules rules = new ClubRules();
            System.out.println(rules.checkEntry(visitor));
        } catch (Exception e) {
            System.out.println("Программа завершилась с ошибкой");
        }
    }
}