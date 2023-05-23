package com.rem.gmdb.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rem.gmdb.models.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

    void update(Integer id);
    
}

