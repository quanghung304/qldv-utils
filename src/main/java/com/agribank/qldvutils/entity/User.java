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
    @Column(name = "staff_code")
    String staffCode;
    @Column(name = "dv_code")
    String dvCode;
    @Column(name = "id_iam")
    Integer idIam;
    String username;
    @Column(name = "full_name")
    String fullName;
    String email;
    Integer brcd;
    @Column(name = "dep_id")
    Integer depId;
    String phone;
    String vneid;
    Integer active;
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
