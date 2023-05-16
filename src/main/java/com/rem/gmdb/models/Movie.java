package com.rem.gmdb.models;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Movie {
    private Integer movieId;
    private Integer year;
    private String title;
    private String genre;
    private String runtime;
   
}
