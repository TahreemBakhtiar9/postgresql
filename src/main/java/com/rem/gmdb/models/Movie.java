package com.rem.gmdb.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor

public class Movie {
    private Integer movieId;
    private int year;
    private String title;
    private String genre;
    private String runtime;
    public void add(Movie movie1) {
    }
}
