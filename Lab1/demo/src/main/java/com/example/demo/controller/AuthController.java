package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.servlet.http.HttpSession;

@Controller
public class AuthController {
    @Autowired
    HttpServletRequest request;

    @GetMapping("/login/form")
    public String form(){
        return "form";
    }

    @PostMapping("/login/check")
    public String login(Model module){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equals("poly") && password.equals("123")){
            module.addAttribute("message","Login Thành Công!!!! ");
        }else{
            module.addAttribute("message","Sai  or Password!!!!");
        }

        return "form";
    }
}
