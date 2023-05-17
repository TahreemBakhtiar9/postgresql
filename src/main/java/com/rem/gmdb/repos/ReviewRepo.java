package com.rem.gmdb.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rem.gmdb.models.Review;

@Repository

public interface ReviewRepo extends JpaRepository<Review, Integer> {

    
    
}

