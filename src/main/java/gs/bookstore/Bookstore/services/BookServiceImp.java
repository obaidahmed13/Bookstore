package gs.bookstore.Bookstore.services;

import gs.bookstore.Bookstore.models.Book;
import gs.bookstore.Bookstore.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImp implements BookService{
    @Autowired
    BookRepository bookRepo;

    @Override
    public List<Book> getAllBooks() {
        return this.bookRepo.findAll();
    }

    @Override
    public Optional<Book> getOneBook(Long id) {
        return this.bookRepo.findById(id);
    }

    @Override
    public Book updateBook(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public Book addBook(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public String removeBook(Long id) {
        return "Book has been removed!";
    }
}
