package com.library.service;
import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Spring calls this setter to inject the repository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void executeBusinessLogic() {
        bookRepository.findBook();
        System.out.println("BookService: Logic executed successfully.");
    }
}