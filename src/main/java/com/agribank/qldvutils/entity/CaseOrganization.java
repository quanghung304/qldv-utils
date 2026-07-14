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
@Table(name = "PMDV_CASE_ORGANIZATION")
@IdClass(CaseOrganizationId.class)
public class CaseOrganization {
    @Id
    @Column(name = "case_id")
    String caseId;

    @Id
    @Column(name = "organization_id")
    String organizationId;

    @Column(name = "case_organization_id")
    String caseOrganizationId;

    @Column(name = "link_role")
    Integer linkRole;
}
