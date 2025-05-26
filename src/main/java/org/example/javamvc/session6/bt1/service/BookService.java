package org.example.javamvc.session6.bt1.service;

import org.example.javamvc.session6.bt1.dao.BookDao;
import org.example.javamvc.session6.bt1.model.Book;

import java.util.List;

public class BookService {
    private final BookDao bookDao = new BookDao();

    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    public Book getBookById(int id) {
        return bookDao.getBookById(id);
    }

    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    public void deleteBook(int id) {
        bookDao.deleteBook(id);
    }
}
