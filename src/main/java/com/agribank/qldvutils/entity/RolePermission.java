package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_ROLE_PERMISSION",
        uniqueConstraints = @UniqueConstraint(columnNames = {"role_code", "function_code", "action"}))
public class RolePermission extends BaseEntity<String> {
    @Column(name = "role_code")
    String roleCode;

    @Column(name = "function_code")
    String functionCode;

    @Column(name = "action")
    String action;

    @Column(name = "is_conditional")
    Boolean isConditional;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
