package com.vsoft.account_management.controller;

import com.vsoft.account_management.model.Book;
import com.vsoft.account_management.model.User;
import com.vsoft.account_management.service.BookService;
import com.vsoft.account_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("")
    public String loadBookForm(Model model){

        List<Book> books = bookService.getBooks();
        model.addAttribute("books", books);

        return "/book";
    }

    @PostMapping("/add")
    public String addBook(@ModelAttribute Book book){
         bookService.addBook(book);
        return "redirect:/book";
    }

    @GetMapping("/all")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @GetMapping(value = "/{id}")
    public String updateForm(@PathVariable("id") Long id, Model model){
        List<Book> books = bookService.getBooks();
        model.addAttribute("books", books);
        Book book = bookService.findBookById(id);
        System.out.println(book);
        model.addAttribute("bookData", book);
        return "/book";

    }

    @PostMapping("/update/{id}")
    public String updateBook(@ModelAttribute Book book, @PathVariable("id") Long id, Model model){
        book.setId(id);
        bookService.updateBook(book);
        return "redirect:/book";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id){
        bookService.deleteBook(id);
        return "redirect:/book";
    }
}
