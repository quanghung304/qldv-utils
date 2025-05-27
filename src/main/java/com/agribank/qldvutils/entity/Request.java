package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Comment;

import java.sql.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "qldv_requests")
public class Request extends BaseEntity<String> {
    @Comment("0: tcd, 1: dang vien, 2: can bo")
    Integer type;
    @Column(name = "parent_organization_code")
    String parentOrganizationCode;
    @Column(name = "organization_code")
    String organizationCode;
    @Column(name = "form_code")
    String formCode;
    @Column(name = "form_name")
    String formName;
    @Comment("0: insert, 1: update; 2: delete")
    Integer action;
    @Column(name = "reference_id")
    String referenceId;
    @Column(columnDefinition = "CLOB", name = "old_data")
    String oldData;
    @Column(columnDefinition = "CLOB", name = "new_data")
    String newData;
    @Column(name = "created_by")
    String createdBy;
    @Column(name = "approved_by")
    String approvedBy;
    @Column(name = "approved_at")
    Date approvedAt;
    @Comment("0: pending, 1: approved, 2: denied")
    Integer status;
    @Column(name = "denied_reason")
    String deniedReason;
}
