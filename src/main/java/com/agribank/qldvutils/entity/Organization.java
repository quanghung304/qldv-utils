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

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_ORGANIZATION")
public class Organization extends BaseEntity<String> {
    @Column(name = "organization_code")
    String organizationCode;

    @Column(name = "organization_name")
    String organizationName;

    @Column(name = "organization_type_id")
    String organizationTypeId;

    @Column(name = "brcd")
    Integer brcd;

    @Column(name = "parent_organization_id")
    String parentOrganizationId;

    @Column(name = "is_authorized")
    Boolean isAuthorized;

    @Column(name = "member_count")
    Integer memberCount;

    @Column(name = "committee_member_count")
    Integer committeeMemberCount;

    @Column(name = "operation_status")
    Integer operationStatus;

    @Column(name = "establish_decision_no")
    String establishDecisionNo;

    @Column(name = "establish_decision_date")
    LocalDate establishDecisionDate;

    @Column(name = "dissolve_decision_no")
    String dissolveDecisionNo;

    @Column(name = "dissolve_decision_date")
    LocalDate dissolveDecisionDate;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
