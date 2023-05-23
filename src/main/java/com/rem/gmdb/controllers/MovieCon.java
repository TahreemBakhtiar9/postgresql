package com.rem.gmdb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PostMapping("")
    public void addMovie(@RequestBody Movie movie){
       movieRepo.save(movie);
    }

    @GetMapping("/all")
    public List<Movie> getallMovies(){
        return movieRepo.findAll();

    }

    @GetMapping("/{Id}")
    public Movie getbyId(@PathVariable Integer Id) {
        return this.movieRepo.findById(Id).orElse(null);

    }

    @DeleteMapping("/{Id}")
    public void delete(@PathVariable Integer Id){
        movieRepo.deleteById(Id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Movie movie){
        movieRepo.save(movie);
    }

}