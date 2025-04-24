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
@Table(name = "QLDV_USER")
public class User extends BaseEntity<String> {
    @Column(name = "dv_code")
    String dvCode;
    @Column(name = "id_iam")
    Integer idIam;
    @Column(name = "role_id")
    Integer roleId;
    String username;
    @Column(name = "full_name")
    String fullName;
    String email;
    Integer brcd;
    @Column(name = "dep_id")
    Integer depId;
    String phone;
    Integer vneid;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
