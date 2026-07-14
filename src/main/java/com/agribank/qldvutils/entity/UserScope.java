package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_USER_SCOPE")
@IdClass(UserScopeId.class)
public class UserScope {
    @Id
    @Column(name = "user_id")
    String userId;

    @Id
    @Column(name = "organization_id")
    String organizationId;

    @Column(name = "user_scope_id")
    String userScopeId;
}
