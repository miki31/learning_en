package com.vocabulary.en.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class Welcome {

    @GetMapping("")
    public String sayWelcome(Model model){
        return "welcome";
    }

}
