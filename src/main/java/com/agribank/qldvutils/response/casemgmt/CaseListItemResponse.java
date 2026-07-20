package com.agribank.qldvutils.response.casemgmt;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

/**
 * Contract dùng chung giữa qldv-api và qldv-db: qldv-db trả trực tiếp từ 1 câu JPQL join
 * PMDV_CASE với PMDV_CASE_TYPE, PMDV_STATUS, QLDV_USER (constructor expression) — dùng cho cả
 * danh sách (GET/POST /cases) lẫn chi tiết (GET /cases/{id}), tránh phải fetch riêng từng bảng
 * danh mục rồi map thủ công ở qldv-api.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CaseListItemResponse {
    String caseId;
    String caseCode;
    String caseTypeId;
    String caseTypeName;
    String statusId;
    String statusName;
    Integer authorityLevel;
    String originFlow;
    String createdBy;
    String createdByName;
    Timestamp createdAt;
    Timestamp updatedAt;
    Timestamp completedAt;
}
