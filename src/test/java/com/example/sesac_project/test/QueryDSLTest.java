package com.example.sesac_project.test;

import com.example.sesac_project.domain.QUser;
import com.example.sesac_project.domain.User;
import com.example.sesac_project.respository.UserRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class QueryDSLTest {

    @Autowired
    private UserRepository userRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void testQueryDSL() {
        // 데이터 저장
        User user = new User("QueryDSL Test");
        userRepository.save(user);


        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        QUser qUser = QUser.user; // Q 클래스

        User result = queryFactory.selectFrom(qUser)
                .where(qUser.name.eq("QueryDSL Test"))
                .fetchOne();

        assertThat(result).isNotNull();
        assertThat(result.getName()).isEqualTo("QueryDSL Test");
    }
}