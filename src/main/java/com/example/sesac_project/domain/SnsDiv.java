package com.example.sesac_project.domain;

import lombok.Getter;

@Getter
public enum SnsDiv {

    GOOGLE("google"), KAKAO("kakao"), NAVER("naver");


    private final String div;

    SnsDiv(String div) {
        this.div = div;
    }
}
