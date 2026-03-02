import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class WorkWithFile {

    public static void convertToUpperCase(String inputFile, String outputFile) throws IOException {
        try (Scanner scanner = new Scanner(new FileInputStream(inputFile));
             PrintWriter writer = new PrintWriter(outputFile)) {
            while (scanner.hasNextLine()){
                String s = scanner.nextLine();
                s = s.toUpperCase();
                writer.println(s);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
    }

    public static int countSubstringIgnoreCase(String inputFile, String str) throws IOException{
        try (Scanner scanner = new Scanner(new FileInputStream(inputFile))){
            int sum = 0;
            str = str.toLowerCase();

            while (scanner.hasNextLine()){
                String s = scanner.nextLine().toLowerCase();
                int index = 0;

                while ((index = s.indexOf(str, index)) != -1){
                    sum++;
                    index += str.length();
                }
            }
            return sum;
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
            return -1;
        }
    }

    public static void main (String[] arg) throws IOException {
        convertToUpperCase("src/input1.txt", "src/output1.txt");
        System.out.println("Число вхождений равно: " + countSubstringIgnoreCase("src/input3.txt", "привет"));
    }
}
