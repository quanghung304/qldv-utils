package com.agribank.qldvutils.response.casemgmt;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * Contract dùng chung giữa qldv-api và qldv-db: qldv-db trả trực tiếp từ 1 câu JPQL join
 * PMDV_CASE_ORGANIZATION với PMDV_ORGANIZATION (constructor expression), qldv-api nhận nguyên
 * vẹn — vừa dùng để hiển thị danh sách tổ chức liên quan, vừa dùng để kiểm tra phạm vi dữ liệu.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CaseOrganizationSummaryResponse {
    String organizationId;
    String organizationName;
    Integer linkRole;
}
