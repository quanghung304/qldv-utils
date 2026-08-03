package com.agribank.qldvutils.response.attachment;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

/**
 * Contract dùng chung giữa qldv-api và qldv-db: qldv-db trả trực tiếp từ 1 câu JPQL join
 * PMDV_ATTACHMENT với QLDV_USER (qua uploaded_by) để lấy tên hiển thị người upload trong CÙNG 1
 * câu query — tránh N+1 (coding-convention.md mục 8).
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AttachmentSummaryResponse {
    String id;
    String fileName;
    String workflowStage;
    String uploadedBy;
    String uploadedByName;
    Timestamp createdAt;
}
