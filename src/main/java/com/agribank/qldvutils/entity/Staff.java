package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_STAFF")
public class Staff extends BaseEntity<String> {
    @Column(name = "staff_code")
    String staffCode;

    @Column(name = "full_name")
    String fullName;

    @Column(name = "gender")
    String gender;

    @Column(name = "date_of_birth")
    LocalDate dateOfBirth;

    @Column(name = "ethnicity")
    String ethnicity;

    @Column(name = "religion")
    String religion;

    @Column(name = "hometown")
    String hometown;

    @Column(name = "official_party_admission_date")
    LocalDate officialPartyAdmissionDate;

    @Column(name = "qualification")
    String qualification;

    @Column(name = "brcd")
    Integer brcd;

    @Column(name = "organization_id")
    String organizationId;

    @Column(name = "data_source")
    Integer dataSource;

    @Column(name = "synced_at")
    Timestamp syncedAt;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
