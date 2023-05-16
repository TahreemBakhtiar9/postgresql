package com.rem.gmdb.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor

public class Review {
    @Id
    private Integer reviewId;
    private Integer movieId;
    private Integer reviewerId;
    private String review;
    private String lastmodifiedDate;

    
}

