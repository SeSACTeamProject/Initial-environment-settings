package com.example.sesac_project.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.JoinColumn;

import java.util.Date;

@Embeddable
public class Curriculum {

    @JoinColumn(nullable = false)
    private String name;

    @JoinColumn(nullable = false)
    private Date start_date;

    @JoinColumn(nullable = false)
    private Date end_date;
}
