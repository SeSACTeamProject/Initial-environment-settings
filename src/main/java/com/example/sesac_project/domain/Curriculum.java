package com.example.sesac_project.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.JoinColumn;

import java.util.Date;

@Embeddable
public class Curriculum {

    @Column(nullable = false)
    private String curriculumName;

    @Column(nullable = false)
    private Date start_date;

    @Column(nullable = false)
    private Date end_date;

}
