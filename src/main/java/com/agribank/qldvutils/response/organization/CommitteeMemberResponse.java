package com.agribank.qldvutils.response.organization;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

/**
 * Contract dùng chung giữa qldv-api và qldv-db: qldv-db trả trực tiếp từ 1 câu JPQL join
 * PMDV_COMMITTEE_MEMBER với PMDV_STAFF (constructor expression), qldv-api nhận nguyên vẹn,
 * không cần query Staff riêng để lấy full_name.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommitteeMemberResponse {
    String staffCode;
    String fullName;
    Integer position;
    Integer status;
    String appointmentDecisionNo;
    LocalDate effectiveDate;
    LocalDate expiryDate;
}
