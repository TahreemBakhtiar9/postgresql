package com.rem.gmdb.models;

import com.rem.gmdb.repos.ReviewRepo;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor

public class Review implements ReviewRepo  {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer reviewId;
    private String review;
    private String lastmodifiedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movieId")
    private Movie movies;
    
}

