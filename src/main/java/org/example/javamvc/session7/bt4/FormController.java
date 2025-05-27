package org.example.javamvc.session7.bt4;

import org.example.javamvc.session7.bt4.model.Feedback;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FormController {

    private final List<Feedback> feedbackList = new ArrayList<>();

    @GetMapping("/form")

    public String showForm(Model model) {
        // dùng model để thêm thuộc tính vào
        // Thêm một đối tượng Feedback mới (rỗng) vào model, để form có dữ liệu
        model.addAttribute("feedback", new Feedback());
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute("feedback") Feedback feedback, Model model) {
        if (feedback.getName() == null || feedback.getName().trim().isEmpty()) {
            model.addAttribute("error", "Họ và tên không được để trống.");
            return "form";
        }
        if (feedback.getComment() == null || feedback.getComment().trim().isEmpty()) {
            model.addAttribute("error", "Nội dung góp ý không được để trống.");
            return "form";
        }
        if (!feedback.getPhone().matches("\\d{9,11}")) {
            model.addAttribute("error", "Số điện thoại không hợp lệ. Vui lòng nhập 9 đến 11 số.");
            return "form";
        }

        feedbackList.add(feedback);

        model.addAttribute("feedback", feedback);
        return "result";
    }

    @GetMapping("/list")
    public String listFeedback(Model model) {
        model.addAttribute("feedbacks", feedbackList);
        return "list";
    }
}
