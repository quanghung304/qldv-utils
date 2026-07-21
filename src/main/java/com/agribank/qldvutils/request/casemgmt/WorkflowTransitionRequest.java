package com.agribank.qldvutils.request.casemgmt;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * Contract dùng chung giữa qldv-api và qldv-db: qldv-api (WorkflowEngine) đã tính toán và
 * kiểm tra guard xong (rule khớp, role khớp, comment bắt buộc nếu RETURN...), gửi xuống đây để
 * qldv-db CHỈ thực thi 2 việc trong 1 transaction — cập nhật status_id của hồ sơ + ghi 1 dòng
 * PMDV_CASE_HISTORY — không tự quyết định thêm bất kỳ logic nghiệp vụ nào.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WorkflowTransitionRequest {
    String entityTable;
    String entityId;
    String fromStatusId;
    String action;
    String toStatusId;
    String performedBy;
    String performedRoleId;
    String note;
}
