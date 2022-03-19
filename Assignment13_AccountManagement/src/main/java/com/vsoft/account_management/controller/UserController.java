package com.vsoft.account_management.controller;

import com.vsoft.account_management.model.Book;
import com.vsoft.account_management.model.User;
import com.vsoft.account_management.service.BookService;
import com.vsoft.account_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    @Autowired
    private BookController bookController;

    @GetMapping("")
    public String loadForm(Model model){
        User user = new User();
        model.addAttribute("user", user);

        return "login";
    }

    @GetMapping("/user/all")
    public List<User> getAllUsers(){
        return userService.getUsers();
    }

    @GetMapping("/login")
    public String login(@ModelAttribute User user, Model model){
        String msg = "";
        User _user = userService.Login(user.getUsername(), user.getPassword());
        List<Book> books = _user.getBooks();
        List<Book> allBooks = bookService.getBooks();
        if(_user != null){
            model.addAttribute("user",_user);
            model.addAttribute("books",books);
            model.addAttribute("allBooks",allBooks);
            UserData.user = _user;
            return "/book";
        }else  {
            msg = "Login fail";
            model.addAttribute("msg",msg);
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(){
        return "login";
    }
//
    @GetMapping("/register")
    public String registerForm(Model model){
        User user = new User();
        model.addAttribute("user", user);

        return "register";
    }
    @PostMapping("/adduser")
    public String register(@ModelAttribute User user, Model model){
        String msg = "";
//        model.addAttribute("user", user);

        User _user = userService.Register(user);
        if(_user != null){
            msg = "Register Successful";
        }else  {
            msg = "Register fail";
        }
        model.addAttribute("msg",msg);

        return "register";
    }
}
