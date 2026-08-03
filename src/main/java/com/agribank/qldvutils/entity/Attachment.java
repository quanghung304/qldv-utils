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
import org.hibernate.annotations.Comment;

import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_ATTACHMENT")
public class Attachment extends BaseEntity<String> {
    @Column(name = "case_id", nullable = true)
    String caseId;

    @Column(name = "document_id", nullable = true)
    String documentId;

    @Column(name = "file_name")
    String fileName;

    @Column(name = "file_path")
    String filePath;

    @Column(name = "workflow_stage", nullable = false)
    @Comment("status_code (VD 'A-01') của file TẠI THỜI ĐIỂM UPLOAD")
    String workflowStage;

    @Column(name = "uploaded_by")
    String uploadedBy;

    @Column(name = "uploaded_at")
    Timestamp uploadedAt;

    @Column(name = "is_locked")
    Boolean isLocked;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
