package com.rem.gmdb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rem.gmdb.models.Reviewer;
import com.rem.gmdb.repos.ReviewerRepo;

@RestController
@RequestMapping("/reviewer")

public class ReviewerCon {

@Autowired
private ReviewerRepo reviewerRepo;

@PostMapping("/post")
    public void addReviewer(@RequestBody Reviewer reviewer){
        reviewerRepo.save(reviewer);
    }

    // @GetMapping("all")
    //     public List<Reviewer> getallReviewers(){
    //         return reviewerRepo.findAll();
    //     }
    
    @DeleteMapping("/{id}")
        public void delete(@PathVariable int id){
            reviewerRepo.deleteById(id);
        }
    // @PutMapping("/{id}")
    // public void updateReview(@RequestBody Reviewer reviewer){
    //     reviewerRepo.update(reviewer);
    // }

    @GetMapping("/{id}")
        public Reviewer getbyId(@PathVariable Integer id){
            return this.reviewerRepo.findById(id).orElse(null);
        }
    
    
}
