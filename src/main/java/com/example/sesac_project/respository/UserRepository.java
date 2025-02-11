package com.example.sesac_project.respository;

import com.example.sesac_project.example_domatin.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}