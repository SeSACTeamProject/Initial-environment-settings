package com.example.sesac_project.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
public class BaseEntity {

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "update_at")
    private LocalDateTime updatedAt;


    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "delete_flag", nullable = false)

    private boolean deleteFlag;


    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
        if (deleteFlag) {
            this.deletedAt = LocalDateTime.now();
        } else {
            this.deletedAt = null;
        }
    }

}

