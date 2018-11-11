package com.jinchao.dbdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    /*
    @RequestMapping("/")
    public String home() {
        return ("home");
    }

    @RequestMapping("/about")
    public String about() {
        return ("about");
    }

    @RequestMapping("/causes")
    public String causes() {
        return ("causes");
    }

    @RequestMapping("/gallery")
    public String gallery() {
        return ("gallery");
    }

    @RequestMapping("/news")
    public String news() {
        return ("news");
    }

    @RequestMapping("/contact")
    public String contact() {
        return ("contact");
    } */
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/signup")
    public String signup() {
        return "signup";
    }

}
