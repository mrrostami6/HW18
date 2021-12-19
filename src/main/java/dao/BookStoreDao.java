package dao;

import entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookStoreDao {
    private static final List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public Book getBook(String name){
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name))
                return book;
        }
        return null;
    }
}
