package Java5.lab3.controller;

import Java5.lab3.entities.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class radioController {
    @RequestMapping("/staff/radio")
    public String list(Model model){
        List<Staff> list = List.of(
                Staff.builder().id("User01@gmail.com").fullname("Trần Đức Hoài Quốc").level(1).build(),
                Staff.builder().id("User02@gmail.com").fullname("Trương Minh Quang").level(0).build(),
                Staff.builder().id("User03@gmail.com").fullname("Trương Cẩm Thắng").level(2).build(),
                Staff.builder().id("User04@gmail.com").fullname("Nguyễn Khắc Quân").level(0).build(),
                Staff.builder().id("User05@gmail.com").fullname("1").level(1).build(),
                Staff.builder().id("User06@gmail.com").fullname("2").level(1).build()
        );
        model.addAttribute("list",list);

        return "radio-list.html";
    }
}
