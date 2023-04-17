package com.example.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

//    @GetMapping("/detail")
//    public String item(){
//        return "detail";
//    }
    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }
    @GetMapping("/signin")
    public String signin(){
        return "signin";
    }
    @GetMapping("/item")
    public String pay(){
        return "item";
    }
//    @GetMapping("/post")
//    public String itempost(){
//        return "post";
//    }
    @GetMapping("/event")
    public String event() {
        return "event";
    }
//    @GetMapping("/pay_ok")
//    public String payok() {
//        return "payok";
//    }

    @GetMapping("/home")
    public String loign(){
        return "loginhome";
    }
    @GetMapping("/mypage")
    public String mypage(){
        return "mypage";
    }
    @GetMapping("/Cs")
    public String CS(){
        return "cs";
    }
    @GetMapping("/term")
    public String term() { return "term"; }
}
