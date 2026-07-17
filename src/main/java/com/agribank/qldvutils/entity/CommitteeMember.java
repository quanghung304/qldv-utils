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

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_COMMITTEE_MEMBER")
@IdClass(CommitteeMemberId.class)
public class CommitteeMember {
    @Id
    @Column(name = "organization_id")
    String organizationId;

    @Id
    @Column(name = "staff_code")
    String staffCode;

    @Column(name = "committee_member_id")
    String committeeMemberId;

    @Column(name = "position")
    Integer position;

    @Column(name = "status")
    Integer status;

    @Column(name = "appointment_decision_no")
    String appointmentDecisionNo;

    @Column(name = "effective_date")
    LocalDate effectiveDate;

    @Column(name = "expiry_date")
    LocalDate expiryDate;
}
