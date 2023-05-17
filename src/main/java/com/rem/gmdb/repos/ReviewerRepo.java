package com.rem.gmdb.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rem.gmdb.models.Reviewer;

@Repository

public interface ReviewerRepo extends JpaRepository<Reviewer , Integer> {


    
}
