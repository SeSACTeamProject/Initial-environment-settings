package com.example.sesac_project.domain;

import jakarta.persistence.*;
import lombok.*;


import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)  // JPA 기본 생성자
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "posts")
public class Post extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "post_id")
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "LONGTEXT", nullable = false)
    private String content;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PostType postType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PostStatus postStatus;

    @Builder.Default
    private Integer viewsCount = 0;

    @Builder.Default
    private Integer likesCount = 0;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

//    @Builder.Default
//    @OneToMany(mappedBy = "post") // cascade = CascadeType.ALL
//    private List<Like> likes = new ArrayList<>();
//
//    @Builder.Default
//    @OneToMany(mappedBy = "post") // cascade = CascadeType.ALL
//    private List<Comment> comments = new ArrayList<>();


}
