package com.agribank.qldvutils.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

@Data
@MappedSuperclass
@Access(AccessType.FIELD)
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class BaseEntity <T>{
    @Id
    @Basic
    @GeneratedValue(strategy = GenerationType.UUID)
    T id;

    @Column(name = "created_at")
    Timestamp createdAt;
    @Column(name = "updated_at")
    Timestamp updatedAt;

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
