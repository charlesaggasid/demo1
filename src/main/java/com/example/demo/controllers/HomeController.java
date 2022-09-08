package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {
   @GetMapping("/home")
    public String welcome() {
        return "home";
    }

    @GetMapping("/quote-of-the-day/by/{author}")
    public String quote(@PathVariable String author, Model model){
        model.addAttribute("author", author);
        return "quotes";
    }

}
