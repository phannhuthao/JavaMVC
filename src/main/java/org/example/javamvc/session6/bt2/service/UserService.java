package org.example.javamvc.session6.bt2.service;

import org.example.javamvc.session6.bt2.dao.UserDao;
import org.example.javamvc.session6.bt2.model.User;

public class UserService {
    private UserDao userDao = new UserDao();

    public boolean register(User user) {
        return userDao.insertUser(user);
    }

    public User login(String email, String password) {
        return userDao.login(email, password);
    }
}
