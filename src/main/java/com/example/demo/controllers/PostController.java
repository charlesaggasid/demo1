package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String indexPage() {
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String postId(@PathVariable long id, Model model) {
        model.addAttribute("id", id);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String showCreatePost() {
        return "create post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createdPost(){
        return"create";
    }



}
