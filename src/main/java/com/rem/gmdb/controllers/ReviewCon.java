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
import org.springframework.web.service.annotation.PutExchange;

import com.rem.gmdb.models.Review;
import com.rem.gmdb.repos.ReviewRepo;

@RestController
@RequestMapping("/reviews")

public class ReviewCon {
    @Autowired
    private ReviewRepo reviewRepo;
    

    @PostMapping("")
    public void addReview(@RequestBody Review review){
        reviewRepo.save(review);
    }

    @GetMapping("/Revs")
        public List<Review> getallReviews(){
            return reviewRepo.findAll();
        }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        reviewRepo.deleteById(id);
    }
        
    @PutMapping("/Update")
    public void updateReview(@RequestBody Review review){
        reviewRepo.save(review);
    }
    
}
