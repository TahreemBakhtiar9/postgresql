package com.rem.gmdb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rem.gmdb.models.Movie;


public interface MovieRepo extends JpaRepository<Movie, Long> {
    
}

