package com.vocabulary.en.learning.controller;


import com.vocabulary.en.learning.model.vocabulary.en.WordEn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        WordEn wordEn = new WordEn();
        return "login";
    }

}
