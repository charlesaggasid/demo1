package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String indexPage() {
        return "Index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postId(@PathVariable long id) {
        return "view an individual post";
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
