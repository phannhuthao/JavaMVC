package org.example.javamvc.session9.bt2.service;

import org.example.javamvc.session9.bt2.dao.MovieDao;
import org.example.javamvc.session9.bt2.model.Movie;

import java.util.List;

public class MovieService {
    public List<Movie> getAllMovies() {
        return MovieDao.showInfoMovie();
    }

    public Movie getMovieDetail(Long id) {
        return MovieDao.showInfoDetailMovie(id);
    }
}
