package com.example.demo.controllers;

import com.example.demo.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String viewPosts(Model model) {
        List<Post> allPosts = new ArrayList<>();
        Post p2 = new Post(2, "Test", "This is for testing purposes");
        Post p3 = new Post(3, "Weather Update", "It's gon rain");
        Post p4 = new Post(4, "Codeup", "Join codeup today and get your career launched in tech!");

        allPosts.add(p2);
        allPosts.add(p3);
        allPosts.add(p4);

        model.addAttribute("allPosts", allPosts);

        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String postId(@PathVariable long id, Model model) {
        Post post1 = new Post(1, "Regulus Spring", "Hello, we are currently learning views in Spring!");
        model.addAttribute("singlePost", post1);
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
