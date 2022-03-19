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

    @Autowired
    private UserService userService;
    @GetMapping("")
    public String loadBookForm(Model model){
        UserData.user = userService.findUserById(UserData.user.getId());
        List<Book> userBooks = UserData.user.getBooks();
        List<Book> allBooks = bookService.getBooks();
        model.addAttribute("books", userBooks);
        model.addAttribute("allBooks", allBooks);
        model.addAttribute("user", UserData.user);
        return "/book";
    }


    @PostMapping("/add")
    public String addBook(@ModelAttribute Book book, Model model){
//        book.setUser(UserData.user);
        List<Book> userBooks = UserData.user.getBooks();
        model.addAttribute("books", userBooks);
        Book b = bookService.addBook(book);
        UserData.user.getBooks().add(b);
        userService.Register(UserData.user);

        return "redirect:/book";
    }

    @GetMapping("/all")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @GetMapping(value = "/{id}")
    public String updateForm(@PathVariable("id") Long id, Model model){

        Book book = bookService.findBookById(id);


        List<Book> books = UserData.user.getBooks();
        List<Book> allBooks = bookService.getBooks();

        model.addAttribute("books", books);
        model.addAttribute("user", UserData.user);
        model.addAttribute("bookData", book);
        model.addAttribute("allBooks", allBooks);
        return "/book";

    }

    @PostMapping("/update/{id}")
    public String updateBook(@ModelAttribute Book book, @PathVariable("id") Long id, Model model){
        book.setId(id);
        book.setUser(UserData.user);
        bookService.updateBook(book);
        return "redirect:/book";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id){
        bookService.deleteBook(id);
        return "redirect:/book";
    }
}
