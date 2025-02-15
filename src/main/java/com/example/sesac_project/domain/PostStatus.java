package com.example.sesac_project.domain;


import lombok.Getter;

@Getter
public enum PostStatus {

    IN_PROGRESS("in_progress"),COMPLETED("completed");

    private final String type;

    PostStatus(String type) {
        this.type = type;
    }

}
