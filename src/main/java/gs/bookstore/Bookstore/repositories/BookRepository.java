package gs.bookstore.Bookstore.repositories;

import gs.bookstore.Bookstore.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByName(String name);

    List<Book> findByAuthor(String author);

}
