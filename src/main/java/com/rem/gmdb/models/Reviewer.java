package com.rem.gmdb.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor

public class Reviewer {
    private Integer reviewerId;
    private String username;
    private Integer noOfReviews;
    private String dateJoined;
 }

