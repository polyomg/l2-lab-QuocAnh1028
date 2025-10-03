package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RetangleController {
    @Autowired
    HttpServletRequest request;

    @GetMapping("/rectangle")
    public String rectangle(){
        return "Rectangle";
    }

    @PostMapping("/rectangle/caculate")
    public String caculate(Model model){
        String perimeter = null,area=null,length=null,width=null;
        try {
            length = request.getParameter("length");
            width = request.getParameter("width");

            if (length.equals("") || width.equals("")) {
                model.addAttribute("message","Không để trống chiều dài hoạc chiều rộng ");
            }else {
                double leng = Double.parseDouble(length);
                double wid = Double.parseDouble(width);
                perimeter = String.valueOf((leng+wid)*2);
                area = String.valueOf(leng * wid);
                model.addAttribute("perimeter",perimeter);
                model.addAttribute("area",area);
            }

        }catch (NumberFormatException e){
            model.addAttribute("message","Nhập số chứ không nhập chữ!!!!");
        }
        return "Rectangle";
    }
}
