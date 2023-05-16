package com.rem.gmdb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rem.gmdb.models.Movie;
import com.rem.gmdb.repos.MovieRepo;

@RestController
@RequestMapping("/movies")
public class MovieCon {
    @Autowired
    private  MovieRepo movieRepo;

    @PostMapping("/post")
    public void addMovie(@RequestBody Movie movie){
       movieRepo.save(movie);
    }

    @GetMapping("/all")
    public List<Movie> getallMovies(){
        return movieRepo.findAll();

    }


}