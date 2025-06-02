package org.example.javamvc.session9.bt2.dao;

import org.example.javamvc.session9.bt2.config.DatabaseConnect;
import org.example.javamvc.session9.bt2.model.Movie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDao {

    public static List<Movie> showInfoMovie() {
        List<Movie> movies = new ArrayList<>();
        try (Connection conn = DatabaseConnect.getConnection()) {
            String sql = "SELECT * FROM movies";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Movie movie = new Movie(
                        rs.getLong("id"),
                        rs.getString("title"),
                        rs.getString("director"),
                        rs.getString("genre"),
                        rs.getString("description"),
                        rs.getInt("duration"),
                        rs.getString("language")
                );
                movies.add(movie);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movies;
    }

    public static Movie showInfoDetailMovie(Long id) {
        try (Connection conn = DatabaseConnect.getConnection()) {
            String sql = "SELECT * FROM movies WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Movie(
                        rs.getLong("id"),
                        rs.getString("title"),
                        rs.getString("director"),
                        rs.getString("genre"),
                        rs.getString("description"),
                        rs.getInt("duration"),
                        rs.getString("language")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
