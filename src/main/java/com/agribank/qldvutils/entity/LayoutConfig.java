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
@Table(name = "QLDV_LAYOUTCONFIG")
public class LayoutConfig {
    @Id
    @Column(name = "id")
    String id;

    @Column(name = "name")
    String name;
    @Column(name = "description")
    String description;
    @Column(name = "content")
    String content;
    @Column(name = "created_at")
    Timestamp createdAt;
    @Column(name = "updated_at")
    Timestamp updatedAt;
}
