package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Comment;

@Data
@Entity
@Table(name = "qldv_requests")
public class Request extends BaseEntity<String> {
    @Column(name = "form_code")
    String formId;
    @Column(name = "form_name")
    String formName;
    @Comment("0: insert, 1: update; 2: delete")
    Integer action;
    @Column(name = "reference_id")
    String referenceId;
    @Column(columnDefinition = "jsonb", name = "old_data")
    String oldData;
    @Column(columnDefinition = "jsonb", name = "new_data")
    String newData;
    @Column(name = "created_by")
    String createdBy;
    @Column(name = "approved_by")
    String approvedBy;
    @Comment("0: pending, 1: approved, 2: denied")
    Integer status;
}
