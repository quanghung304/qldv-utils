package com.agribank.qldvutils.request.casemgmt;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;
import java.util.List;

/**
 * Contract dùng chung giữa qldv-api và qldv-db cho API tra cứu hồ sơ nghiệp vụ — qldv-api xây
 * dựng (kèm allowedOrganizationIds tính theo phạm vi user), qldv-db nhận và lọc/phân trang
 * trong 1 câu query.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CaseSearchQuery extends PagingRequest {
    String keyword;
    List<String> caseTypeId;
    List<String> statusId;
    Integer authorityLevel;
    Timestamp createdFrom;
    Timestamp createdTo;
    Timestamp completedFrom;
    Timestamp completedTo;
    /** Danh sách case_id được phép xem (đã lọc theo tổ chức đảng thuộc phạm vi user) — do
     * qldv-api tự tính rồi gửi xuống; null nghĩa là full-scope (không giới hạn). KHÔNG phải
     * field do FE gửi lên. */
    List<String> allowedOrganizationIds;
}
