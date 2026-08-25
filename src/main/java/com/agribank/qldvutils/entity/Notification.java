package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_NOTIFICATION")
public class Notification extends BaseEntity<String>{
    String title;
    String content;
    String type;
    @Column(name = "ref_id")
    String refId;
    String screen;
}
