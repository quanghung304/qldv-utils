package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.sql.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "qldv_transformation_history_draft")
public class TransformationHistoryDraft extends BaseEntity<String> {
    @Column(name = "organization_code")
    String organizationCode;
    @Column(name = "old_name")
    String oldName;
    @Column(name = "old_form")
    String oldForm;
    @Column(name = "new_name")
    String newName;
    @Column(name = "new_form")
    String newForm;
    @Column(name = "desicion_committee")
    String decisionCommittee;
    @Column(name = "conclusion_number")
    String conclusionNumber;
    @Column(name = "conclusion_date")
    Date conclusionDate;
    @Column(name = "decision_number")
    String decisionNumber;
    @Column(name = "decision_date")
    Date decisionDate;
    @Column(name = "effective_date")
    Date effectiveDate;
    @Comment("ma can bo thuc hien")
    String submitter;
    @Comment("ma can bo duyet")
    String approver;
    Integer status;
}
