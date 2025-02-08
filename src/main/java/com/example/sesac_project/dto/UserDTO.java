package com.example.sesac_project.dto;


import lombok.Data;

@Data
public class UserDTO {

    private Long id;
    private String name;

    public UserDTO() {}

    public UserDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}