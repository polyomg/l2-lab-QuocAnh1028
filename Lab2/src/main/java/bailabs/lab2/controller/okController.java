package bailabs.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ctrl")
public class okController {
    @PostMapping("/ok")
    public String m1(Model model){
        model.addAttribute("result","call m1");
        return "ok";
    }
    @GetMapping("/ok")
    public String m2(Model model){
        model.addAttribute("result","call m2");
        return "ok";
    }
    @PostMapping(value = "/ok", params ="x")
    public String m3(Model model){
        model.addAttribute("result","call m3");
        return "ok";
    }
}
