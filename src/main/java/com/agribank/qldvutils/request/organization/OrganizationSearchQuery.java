package com.agribank.qldvutils.request.organization;

import com.agribank.qldvutils.request.PagingRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

/**
 * Contract dùng chung giữa qldv-api và qldv-db cho API tra cứu tổ chức đảng — qldv-api xây dựng
 * (kèm allowedIds tính theo phạm vi user), qldv-db nhận và lọc/phân trang trong 1 câu query.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationSearchQuery extends PagingRequest {
    String keyword;
    List<Integer> status;
    List<String> organizationTypeId;
    LocalDate decisionDateFrom;
    LocalDate decisionDateTo;
    /** Danh sách organization_id được phép xem — do qldv-api tự tính theo phạm vi user rồi gửi
     * xuống; null nghĩa là full-scope (không giới hạn). KHÔNG phải field do FE gửi lên. */
    List<String> allowedIds;
}
