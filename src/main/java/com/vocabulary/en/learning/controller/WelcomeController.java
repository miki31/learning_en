package com.vocabulary.en.learning.controller;

import com.vocabulary.en.learning.model.User;
import com.vocabulary.en.learning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String sayWelcome(Model model){
        return "welcome";
    }

}
