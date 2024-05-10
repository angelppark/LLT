package com.llt.v1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    String main(Model model){
        model.addAttribute("data", "데이터 <b>data!</b>");
        return "main.html";
    }
}
