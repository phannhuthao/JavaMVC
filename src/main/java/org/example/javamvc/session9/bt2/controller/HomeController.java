package org.example.javamvc.session9.bt2.controller;

import org.example.javamvc.session9.bt2.model.Movie;
import org.example.javamvc.session9.bt2.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {
    private final MovieService movieService = new MovieService();

    @GetMapping("/home")
    public String home(Model model) {
        List<Movie> movieList = movieService.getAllMovies();
        model.addAttribute("movies", movieList);
        return "homebt2";
    }

    @GetMapping("/detailMovie")
    public String detailMovie(@RequestParam("id") Long id, Model model) {
        Movie movie = movieService.getMovieDetail(id);
        model.addAttribute("movie", movie);
        return "detailMovie";
    }
}
