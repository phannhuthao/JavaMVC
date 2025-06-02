package org.example.javamvc.session9.bt1.dao;

import org.example.javamvc.session9.bt1.config.DatabaseConnect;
import org.example.javamvc.session9.bt1.model.Customer;

import java.sql.*;

public class CustomerDAO {
    public static Customer checkLogin(String username, String password) {
        try (Connection conn = DatabaseConnect.getConnection()) {
            String sql = "SELECT * FROM customer WHERE username = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Customer(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getString("gender"),
                        rs.getString("email")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
