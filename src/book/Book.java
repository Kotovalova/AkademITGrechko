package book;

import java.util.Objects;

public class Book {
    private String title = null;
    private String author = null;
    private double price = -1;
    private String isbn = null;

    public Book(String title, String author, double price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object o) {
        // проверяем что это один и тот же объект (ссылка)
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        // приводим входящий объект к нашему классу
        Book book = (Book) o;

        //и уже сравниваем по уникальному полю
        // если несколько задают уникальность, то надо все их тут перечислить
        return isbn.equals(book.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "\n Книга [ Название: " + title + ", Автор: " + author + ", Цена: " + price + ", ISBN: " + isbn + " ]";
    }
}
