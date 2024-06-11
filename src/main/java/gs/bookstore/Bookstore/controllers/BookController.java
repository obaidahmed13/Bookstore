package gs.bookstore.Bookstore.controllers;

import gs.bookstore.Bookstore.models.Book;
import gs.bookstore.Bookstore.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    BookService bookServ;

    @GetMapping("/book")
    public List<Book> getAllBooks() {
        return this.bookServ.getAllBooks();
    }

    @GetMapping("/book/name")
    public List<Book> getBookByName(@RequestParam String name) {
        return this.bookServ.findByName(name);
    }

    @GetMapping("/book/author")
    public List<Book> getBookByAuthor(@RequestParam String author) {
        return this.bookServ.findByAuthor(author);
    }

    @GetMapping("/book/{id}")
    public Optional<Book> getOneBook(@PathVariable Long id) {
        return this.bookServ.getOneBook(id);
    }



    @PostMapping("/book/add")
    public Book addBook(@RequestBody Book book) {
        return this.bookServ.addBook(book);
    }
    @PutMapping("/book/update")
    public Book updateBook(@RequestBody Book book) {
        return this.bookServ.updateBook(book);
    }

    @DeleteMapping("/book/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        return this.bookServ.removeBook(id);
    }








}
