package FirstProject.Cataloger.controller;

import FirstProject.Cataloger.model.Book;
import FirstProject.Cataloger.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/books")
    List<Book> all() {
        return bookRepository.findAll();
    }

    @PostMapping("/books")
    Book newBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @PutMapping("/books/{id}")
    Book updateBook(@RequestBody Book newBook, @PathVariable Long id) {
        return bookRepository.findById(id).map(item -> {
                    item.setTitle(newBook.getTitle());
                    item.getYearOfPublication();
                    item.getBookType();
                    return bookRepository.save(item);
                })
                .orElseGet(() -> {
                    newBook.setId(id);
                    return bookRepository.save(newBook);
                });
    }

    @DeleteMapping("/books/{id}")
    void deleteBook(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }
}
