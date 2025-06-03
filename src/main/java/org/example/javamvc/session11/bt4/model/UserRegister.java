package org.example.javamvc.session11.bt4.model;

import org.example.javamvc.session11.bt3.validator.ValidEmail;
import org.example.javamvc.session11.bt4.validator.ValidPassword;

import javax.validation.constraints.NotBlank;

public class UserRegister {
    @NotBlank(message = "Tên không được để trống")
    private String name;

    @NotBlank(message = "Email không được để trống")
    @ValidEmail
    private String email;

    @NotBlank(message = "Mật khẩu không được để trống")
    @ValidPassword
    private String password;

    public UserRegister(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}

