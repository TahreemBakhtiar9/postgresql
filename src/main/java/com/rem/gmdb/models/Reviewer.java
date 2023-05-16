package com.rem.gmdb.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor

public class Reviewer {
    @Id
    private Integer reviewerId;
    private String username;
    private Integer noOfReviews;
    private String dateJoined;
 }

