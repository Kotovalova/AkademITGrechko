package club.entry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {
    public static String readName(Scanner scanner) {
        while (true){
            try{
                System.out.println("Введите имя посетителя");

                if (!scanner.hasNextLine()){
                    throw new RuntimeException("Ввод не возможен, программа завершена");
                }

                String name = scanner.nextLine().trim();

                if (name.isEmpty()){
                    System.out.println("Имя не может быть пустым. Повторите ввод");
                    continue;
                }

                return name;

            } catch (RuntimeException e){
                throw new RuntimeException("Ввод имени не возможен, программа завершена");
            }
        }
    }

    public static int readAge(Scanner scanner) {
        while (true){
            try {
                System.out.println("Введите возраст посетителя");

                if (!scanner.hasNextLine()){
                    throw new RuntimeException("Ввод не возможен, программа завершена");
                }

                String ageString = scanner.nextLine().trim();

                if (ageString.isEmpty()){
                    System.out.println("Возраст не может быть пустым.");
                    continue;
                }

                int age = Integer.parseInt(ageString);

                if( age < 0 || age > 100){
                    System.out.println("Некорректный формат возраста.");
                    continue;
                }

                return age;
            } catch (RuntimeException e) {
                throw new RuntimeException("Ввод возраста не возможен, программа завершена");
            }
        }
    }

    public static String readGender(Scanner scanner) {
        while (true){
            try {
                System.out.println("Введите пол посетителя в формате м/ж");

                if (!scanner.hasNextLine()){
                    throw new RuntimeException("Ввод не возможен, программа завершена");
                }

                String gender = scanner.nextLine().trim().toLowerCase();

                if (gender.isEmpty()){
                    System.out.println("Пол не может быть пустым.");
                    continue;
                }

               if(gender.equals("м")||gender.equals("ж")||gender.equals("m")||gender.equals("w")){
                    return gender;
               } else {
                   System.out.println("Некорректный формат пола.");
               }

            } catch (RuntimeException e) {
                throw new RuntimeException("Ввод пола не возможен, программа завершена");
            }
        }
    }
}