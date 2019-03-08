package ru.mail.polis.todos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlControllers {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}