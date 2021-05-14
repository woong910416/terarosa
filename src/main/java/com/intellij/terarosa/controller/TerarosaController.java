package com.intellij.terarosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TerarosaController {

    @GetMapping("/")
    public String main() {
        return "main/main.html";
    }

}
