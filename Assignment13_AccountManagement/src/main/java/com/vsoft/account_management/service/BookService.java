package com.vsoft.account_management.service;

import com.vsoft.account_management.model.Book;
import com.vsoft.account_management.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    public Book findBookById(Long id){
        return bookRepository.findBookById(id);
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public Book updateBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
}
