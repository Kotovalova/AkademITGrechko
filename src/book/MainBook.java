package book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MainBook {
    // задача:
    //Переопределить equals() и hashCode() так, чтобы две книги считались одинаковыми, если у них совпадает isbn (потому что ISBN уникален для каждой книги).
    //Создать список книг (минимум 5 книг), среди которых должны быть книги с одинаковым названием/автором, но разным ISBN, и наоборот — одинаковый ISBN, но другие поля могут отличаться.
    //Сравнить две книги с одинаковым ISBN, но разными остальными полями, и убедиться, что equals() возвращает true.
    //Отсортировать список книг по убыванию цены (от самой дорогой к самой дешевой).
    //Вывести в консоль:
             //Исходный список
             //Результат сравнения двух книг с одинаковым ISBN
             //Отсортированный список

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>(Arrays.asList(
                new Book("Война и мир", "Лев Толстой", 1200, "978-5-17-123456-7"),
                new Book("Преступление и наказание", "Федор Достоевский", 800, "978-5-17-123457-4"),
                new Book("Анна Каренина", "Лев Толстой", 1100, "978-5-17-123458-1"),
                new Book("Мастер и Маргарита", "Михаил Булгаков", 950, "978-5-17-123459-8"),
                new Book("Идиот", "Федор Достоевский", 700, "978-5-17-123460-4")
        ));
    // книга с таким же ISBN (для проверки equals и hashCode)
        bookList.add(new Book("Война и мир (другое издание)", "Лев Толстой", 1500, "978-5-17-123456-7"));

        System.out.println("Список целиком: \n"  + bookList);
        System.out.println("Сравниваем ве книги с одинаковым ISBN, но разными остальными полями О.Р = true:" + bookList.get(0).toString() + " и " + bookList.get(5).toString());
        boolean one = bookList.get(0).equals(bookList.get(5));
        System.out.println("Результат сравнения: "  + one);
        System.out.println("Сравниваем ве книги с разными ISBN, О.Р = false:" + bookList.get(1).toString() + " и " + bookList.get(4).toString());
        boolean two = bookList.get(1).equals(bookList.get(4));
        System.out.println("Результат сравнения: "  + two);

        System.out.println("\nОтсортируем список по возрастанию цены: ");
        bookList.sort(new Comparator<Book>() {
                          @Override
                          public int compare(Book b1, Book b2) {
                              return Double.compare(b1.getPrice(),b2.getPrice());
                          }
                      }
        );
        System.out.println(bookList);

        System.out.println("\nОтсортируем список по автору: ");
        bookList.sort(new Comparator<Book>() {
                          @Override
                          public int compare(Book b1, Book b2) {
                              return b1.getAuthor().compareTo(b2.getAuthor());
                          }
                      }
        );
        System.out.println(bookList);

        //современная запись
        System.out.println("\nОтсортируем список по названию, автору и цене(по убыванию): ");
        bookList.sort(Comparator
                .comparing(Book::getTitle)
                .thenComparing(Book::getAuthor)
                .thenComparing(Comparator.comparing(Book::getPrice).reversed())
        );
        System.out.println(bookList);

        // реализовать метод check

    }
}
