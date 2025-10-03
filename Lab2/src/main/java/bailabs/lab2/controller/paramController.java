package bailabs.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class paramController {
    @GetMapping("/param/form")
    public String form(){
        return "form";
    }
    @PostMapping("/param/save/{x}")
    public String save(@PathVariable("x") String x,
                       @RequestParam("y")String y,
                       Model model){
        model.addAttribute("x",x);
        model.addAttribute("y",y);
        return "form";
    }
}
