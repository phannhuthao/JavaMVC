package org.example.javamvc.session10.bt4.controller;

import org.example.javamvc.session10.bt4.model.UserProfile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class ProfileController {

    @GetMapping("/upload")
    public String showForm() {
        return "uploadForm";
    }

    @PostMapping("/upload")
    public String uploadAvatar(@RequestParam("username") String username,
                               @RequestParam("avatar") MultipartFile avatar,
                               Model model) throws IOException {

        if (!avatar.isEmpty()) {
            String uploadDir = "C:\\Users\\DELL\\IdeaProjects\\JavaMVC\\upLoadFile";
            File uploadFile = new File(uploadDir + avatar.getOriginalFilename());
            avatar.transferTo(uploadFile);

            UserProfile user = new UserProfile(avatar, username);

            model.addAttribute("message", "Upload ảnh thành công cho người dùng: " + user.getUsername());
            model.addAttribute("fileName", avatar.getOriginalFilename());
        } else {
            model.addAttribute("message", "Vui lòng chọn file.");
        }

        return "result";
    }
}
