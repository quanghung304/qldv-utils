package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_USER_ROLE")
public class UserRole {
    @Id
    @Column(name = "ID")
    String id;
    @Column(name = "USER_ID")
    String userId;
    @Column(name = "ROLE_ID")
    String roleId;
}