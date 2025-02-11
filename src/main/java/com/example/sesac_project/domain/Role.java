package com.example.sesac_project.domain;

public enum Role{
    ADMIN("admin"),USER("user");

    String role;

    public String getRole() {
        return role;
    }

    Role(String role) {
        this.role = role;
    }
}
