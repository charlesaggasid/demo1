package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller //defines that our class is a controller
public class HelloController {

    @GetMapping("/hello") //defines a method that should be invoked when a GET request is received for the specified URI
    @ResponseBody //tells Spring that whatever is returned from this method should be the body of our response
    public String hello() {
        return "Hello from Spring!";
    }

    @GetMapping("/hello/{name}") //Spring allows us to use path variables, that is, variables that are part of the URI of a request, as opposed to being passed as a query string, or as part of the request body.
    public String sayHello(@PathVariable String name, Model model) { // Notice that we can also use annotations in the definition of method parameters.
        // If the path variable we are looking for is not a string, we can simply define the parameter with a different type.
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus 1 is " + (number + 1) + "!";
    }
//Notice in the above example we also used the @RequestMapping annotation, which is just the longer version of @GetMapping. There, of course, also exists a @PostMapping annotation that tells the controller to respond to POST requests.


    @GetMapping("/join")
    public String showJoinForm() {
        return "join";
    }
    @PostMapping("/join")
    public String joinCohort(@RequestParam(name = "cohort") String cohort, Model model) {
        model.addAttribute("cohort", "Welcome to " + cohort + "!");
        return "join";
    }


}
