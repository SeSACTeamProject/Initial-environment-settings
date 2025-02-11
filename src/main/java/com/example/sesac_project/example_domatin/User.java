package com.example.sesac_project.example_domatin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Setter
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;



    public User(String name) {
        this.name = name;
    }

}