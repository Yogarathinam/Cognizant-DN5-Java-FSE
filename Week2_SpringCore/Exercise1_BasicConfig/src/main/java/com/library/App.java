package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load the context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Fetch the bean
        BookService service = (BookService) context.getBean("bookService");

        // Execute
        service.executeBusinessLogic();
    }
}