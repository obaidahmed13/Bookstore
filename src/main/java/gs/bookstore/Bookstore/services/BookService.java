package gs.bookstore.Bookstore.services;


import gs.bookstore.Bookstore.models.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getAllBooks();
    Optional<Book> getOneBook(Long id);
    Book updateBook(Book book);
    Book addBook(Book book);
    String removeBook(Long id);

}
