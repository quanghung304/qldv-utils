package com.agribank.qldvutils.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_USER")
public class User extends BaseEntity<String> {
    @Column(name = "full_name")
    String fullName;
    String username;
    @Column(name = "auth_type")
    String authType;
    @Column(name = "account_status")
    String accountStatus;
    @Column(name = "id_iam")
    Integer idIam;
    Integer brcd;
    @Column(name = "dep_id")
    Integer depId;
    @Column(name = "created_by")
    String createdBy;
    @Column(name = "staff_code")
    String staffCode;
    Integer deleted;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
