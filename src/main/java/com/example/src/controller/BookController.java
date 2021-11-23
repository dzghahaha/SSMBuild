package com.example.src.controller;

import com.example.src.entity.Book;
import com.example.src.service.BookService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {
//
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/index")
    public String init(Model model) {
        List<Book> books = bookService.queryAllBook();
        model.addAttribute("books", books);
        return "index";
    }
}
