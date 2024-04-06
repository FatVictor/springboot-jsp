package com.vtn;


import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("book", new Book());
        return "hello";
    }

    @Data
    public static class Book {
        private String isbn;
        private String name;
        private String author;

        //getters, setters, constructors and toString
    }
}
