package com.example.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/detail")
    public String item(){
        return "detail";
    }
    @GetMapping("/signup&in")
    public String signupin(){
        return "signupin";
    }
    @GetMapping("/pay")
    public String pay(){
        return "pay";
    }
    @GetMapping("/post")
    public String itempost(){
        return "post";
    }
    @GetMapping("/event")
    public String event() {
        return "event";
    }
    @GetMapping("/pay_ok")
    public String payok() {
        return "payok";
    }

    @GetMapping("/home")
    public String loign(){
        return "loginhome";
    }
}
