package org.example.javamvc.session6.bt2.dao;

import org.example.javamvc.session6.bt1.config.DatabaseConnect;
import org.example.javamvc.session6.bt2.model.User;

import java.sql.*;

public class UserDao {

    public boolean insertUser(User user) {
        String sql = "INSERT INTO users (username, password, email, phone) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getEmail());
            stmt.setInt(4, user.getPhone());
            return stmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public User login(String email, String password) {
        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
        try (Connection conn = DatabaseConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("email"),
                        rs.getInt("phone")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
