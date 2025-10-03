package Java5.lab4s.controller;

import Java5.lab4s.entities.Staff;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class staffController {
    @RequestMapping("/staff/create/form")
    public String createForm(Model model, @ModelAttribute("staff") Staff staff) {
        model.addAttribute("message", "Vui lòng nhập thông tin nhân viên!");
        return "staff-create.html";
    }

    @RequestMapping("/staff/create/save")
    public String createSave( Model model,@Valid @ModelAttribute("staff") Staff staff, Errors errors,
                             @RequestPart("photo_file") MultipartFile photoFile) {

        if(!photoFile.isEmpty()) {
            staff.setPhoto(photoFile.getName());
        }
        if (errors.hasErrors()) {
            model.addAttribute("message", "Vui lòng sửa các lỗi sau!");
            return "staff-create.html"; // form có lỗi -> quay lại form
        }
            model.addAttribute("message", "Dữ liệu đã nhập đúng!");
        return "staff-create.html";
    }

}
