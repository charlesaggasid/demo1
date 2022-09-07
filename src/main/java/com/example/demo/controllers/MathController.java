package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @RequestMapping(path = "/add/{firstNumber}/and/{secondNumber}", method = RequestMethod.GET)
    @ResponseBody
    public String addition(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        return firstNumber + " + " + secondNumber + " is " + (firstNumber + secondNumber) + "!";
    }

    @RequestMapping(path = "/multiply/{firstNumber}/and/{secondNumber}", method = RequestMethod.GET)
    @ResponseBody
    public String multiply(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        return firstNumber + " x " + secondNumber + " is " + (firstNumber * secondNumber) + "!";
    }
}
