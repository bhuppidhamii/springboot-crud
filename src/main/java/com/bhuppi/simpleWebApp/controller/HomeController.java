package com.bhuppi.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet() {
        return "Hey, Bhuppi!";
    }

    @RequestMapping("/about")
    public String about() {
        return "This is about page";
    }

}
