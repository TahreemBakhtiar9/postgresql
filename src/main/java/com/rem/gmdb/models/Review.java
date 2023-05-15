package com.rem.gmdb.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor

public class Review {
    private Integer reviewId;
    private Integer movieId;
    private Integer reviewerId;
    private String review;
    private String lastmodifiedDate;

    
}

