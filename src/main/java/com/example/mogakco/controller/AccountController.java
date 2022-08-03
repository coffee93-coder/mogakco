package com.example.mogakco.controller;

import com.example.mogakco.domain.signupForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/sign-up")
    public String signup(Model model) {

        model.addAttribute("signUpForm", new signupForm());

        // 회원가입
        return "account/sign-up";
    }
}
