package com.agribank.qldvutils.response.casemgmt;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

/**
 * Contract dùng chung giữa qldv-api và qldv-db: qldv-db trả trực tiếp từ 1 câu JPQL join
 * PMDV_CASE_HISTORY với PMDV_STATUS (2 lần, from/to) và QLDV_USER (constructor expression),
 * qldv-api nhận nguyên vẹn — không cần query thêm để lấy status_name/performedByName.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CaseHistoryItemResponse {
    String fromStatusId;
    String fromStatusName;
    String action;
    String toStatusId;
    String toStatusName;
    String performedBy;
    String performedByName;
    String performedRoleId;
    String comment;
    Timestamp processedAt;
}
