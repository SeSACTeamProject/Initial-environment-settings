package com.example.sesac_project.domain;

public enum SnsDiv {

    GOOGLE("google"), KAKAO("kakao"), NAVER("naver");


    private String div;

    public String getDiv() {
        return div;
    }

    SnsDiv(String div) {
        this.div = div;
    }
}
