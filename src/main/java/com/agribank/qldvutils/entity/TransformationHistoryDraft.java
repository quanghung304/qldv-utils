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
public class TransformationHistoryDraft extends BaseFormEntity<String> {
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

    @Comment("ma can bo thuc hien")
    String submitter;
    @Comment("ma can bo duyet")
    String approver;
    Integer status;
}
