package com.example.sesac_project.test;

import com.example.sesac_project.example_domatin.User;
import com.example.sesac_project.respository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testDatabaseConnection() {
        // 데이터 저장
        User user = new User("Test User");
        userRepository.save(user);

        // 데이터 조회 검증
        assertThat(userRepository.findById(user.getId())).isPresent();
        assertThat(userRepository.findById(user.getId()).get().getName()).isEqualTo("Test User");
    }
}