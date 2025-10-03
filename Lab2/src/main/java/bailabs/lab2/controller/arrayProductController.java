package bailabs.lab2.controller;

import bailabs.lab2.entities.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class arrayProductController {

    private List<Product> items = new ArrayList<>();

    @GetMapping("/arrayproduct/form")
    public String form(Model model){
        items.removeAll(items);
        Product p = new Product();
        p.setName("Iphone 17pro max");
        p.setPrice(3000.0);
        items.add(p);

        model.addAttribute("prod",p);
        model.addAttribute("save",p);
        return "formAP";
    }

    @PostMapping("/arrayproduct/save")
    public String save(@ModelAttribute("prod") Product p,
                       Model model){
            items.add(p);

            model.addAttribute("prod",p);
            model.addAttribute("save",p);

        return "formAP";
    }
    @ModelAttribute("items")
    public List<Product> getItem(){
        return items;
    }


}
