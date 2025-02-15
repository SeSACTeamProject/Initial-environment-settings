package com.example.sesac_project.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Enumerated;
import lombok.Getter;


@Getter
public enum PostType{

    STUDY("study"),PROJECT("project");

    private final String type;

    PostType(String type) {
        this.type = type;
    }

}
