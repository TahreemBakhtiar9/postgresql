package com.rem.gmdb.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer movieId;
    private Integer year;
    private String title;
    private String genre;
    private String runtime;
   
}
