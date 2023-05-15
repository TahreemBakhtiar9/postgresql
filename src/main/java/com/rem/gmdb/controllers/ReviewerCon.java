package com.rem.gmdb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rem.gmdb.models.Reviewer;
import com.rem.gmdb.repos.ReviewerRepo;

@RESTControllers
@RequestMapping("/reviewer")

public class ReviewerCon {

@Autowired
private ReviewerRepo reviewerRepo;

@PostMapping("/postReviewer/{Id}")
    public void addReview(@RequestBody Reviewer reviewer){
        reviewerRepo.save(reviewer);
    }

    @GetMapping("/Reviewer")
        public List<Reviewer> getallReviewers(){
            return reviewerRepo.findAll();
        }
    
    @DeleteMapping("/{id}")
        public void delete(@PathVariable int id){
            reviewerRepo.deleteById(id);
        }
        
    
    @UpdateMapping("/{id}")
    public void updateReview(@RequestBody Reviewer reviewer){
        reviewerRepo.update(reviewer);
    }
    
    
}
