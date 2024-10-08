package com.wipro.LibraryManagement;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {
    List<Book> findByTitleContaining(String title);
    List<Book> findByAuthorContaining(String author);
}

