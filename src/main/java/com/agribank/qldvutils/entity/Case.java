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

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_CASE")
public class Case extends BaseEntity<String> {
    @Column(name = "case_code")
    String caseCode;

    @Column(name = "case_type_id")
    String caseTypeId;

    @Column(name = "authority_level")
    Integer authorityLevel;

    @Column(name = "origin_flow")
    String originFlow;

    @Column(name = "status_id")
    String statusId;

    @Column(name = "created_by")
    String createdBy;

    @Column(name = "completed_at")
    Timestamp completedAt;

    @Column(name = "affected_member_count")
    Integer affectedMemberCount;

    @Column(name = "affected_committee_count")
    Integer affectedCommitteeCount;

    @Column(name = "proposed_organization_name")
    String proposedOrganizationName;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
