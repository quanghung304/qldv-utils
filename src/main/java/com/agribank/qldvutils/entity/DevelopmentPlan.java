package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

    @Column(name = "BRCD")
    String brcd;

    @Column(name = "NAME")
    String name;

    @Column(name = "START_YEAR")
    Integer start;

    @Column(name = "END_YEAR")
    Integer end;

    @Column(name = "TARGET")
    Integer target;

    @Column(name = "PRNTBRCD")
    String prntBrcd;

    @Column(name = "HAS_CHILD")
    Integer hasChild;

    @Column(name = "created_at")
    Timestamp createdAt;

    @Column(name = "updated_at")
    Timestamp updatedAt;
}
