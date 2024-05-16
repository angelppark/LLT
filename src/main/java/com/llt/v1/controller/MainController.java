package com.llt.v1.controller;

import com.llt.v1.entity.UserEntity;
import com.llt.v1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    String main(Model model){
        List<UserEntity> list = service.getAllUsers();
        model.addAttribute("list", list);
        return "main.html";
    }
}
