package com.agribank.qldvutils.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.sql.Timestamp;

@Data
@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BaseDraftEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    @Column(name = "created_at")
    Timestamp createdAt;
    @Column(name = "updated_at")
    Timestamp updatedAt;
    @Comment("ma can bo thuc hien")
    String createdBy;
    @Comment("ma can bo duyet")
    String approvedBy;
    @Comment("0: pending, 1: da duyet, 2: huy bo")
    Integer status;

    @PrePersist
    protected void onCreate() {
        createdAt = new Timestamp(System.currentTimeMillis());
        updatedAt = new Timestamp(System.currentTimeMillis());
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = new Timestamp(System.currentTimeMillis());
    }
}
