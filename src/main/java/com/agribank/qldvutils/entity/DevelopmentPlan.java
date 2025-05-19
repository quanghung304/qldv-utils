package com.agribank.qldvutils.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "QLDV_DEVELOPMENT_PLAN")
public class DevelopmentPlan {
    @Id
    @Column(name = "ID")
    String id;

    @Column(name = "ORGANIZATION_CODE")
    String organizationCode;

    @Column(name = "NAME")
    String name;

    @Column(name = "START_YEAR")
    Integer start;

    @Column(name = "END_YEAR")
    Integer end;

    @Column(name = "TARGET")
    Integer target;

    @Column(name = "PRNT_CODE")
    String prntCode;

    @Column(name = "HAS_CHILD")
    Integer hasChild;

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
