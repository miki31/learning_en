package com.vocabulary.en.learning.controller;

import com.vocabulary.en.learning.model.User;
import com.vocabulary.en.learning.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("profile")
@Slf4j
public class ProfileController {

    @Autowired
    private UserService userService;

    @Autowired
    @Qualifier("basePath")
    private String basePath;

    @ModelAttribute("user")
    public User activeUser(Authentication authentication){
        return userService.findUserByEmail(authentication.getName()).get();
    }

    @GetMapping
    public String viewProfile(Model model) {
        return "profile";
    }

    @PostMapping("uploadPhoto")
    public String uploadPhoto(@RequestParam("file") MultipartFile file,
                              @ModelAttribute("user") User user){
        String uploadName = file.getOriginalFilename();

        try {
            //TODO: error if file in DB has the same name
            File transferFile = new File(basePath + "/" + uploadName);
            file.transferTo(transferFile);
            log.info("Saved into {}", transferFile.getPath());
            user.setPhoto(uploadName);
            userService.createUpdate(user);
        } catch (IOException e) {
            log.error("Error saving file", e);
        }

        return "redirect:/profile";
    }

}
