package org.example.javamvc.session10.bt4.model;

import org.springframework.web.multipart.MultipartFile;

public class UserProfile {
    private MultipartFile avatar;
    private String username;

    public UserProfile(MultipartFile avatar, String username){
        this.avatar = avatar;
        this.username = username;
    }

    public MultipartFile getAvatar() {
        return avatar;
    }
    public void setAvatar(MultipartFile avatar) {
        this.avatar = avatar;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
