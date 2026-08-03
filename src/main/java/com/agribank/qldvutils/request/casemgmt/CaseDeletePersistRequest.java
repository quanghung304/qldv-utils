package com.agribank.qldvutils.request.casemgmt;

import com.agribank.qldvutils.entity.AuditLog;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * API-GL-01 (DELETE /cases/{id}) — gói cascade-delete toàn bộ dữ liệu con của 1 case + ghi 1 dòng
 * PMDV_AUDIT_LOG thành 1 lệnh gửi xuống qldv-db, chạy trong ĐÚNG 1 transaction
 * ({@code CaseDeleteService.deleteCascade}), cùng pattern atomic multi-entity persist đã dùng cho
 * {@code EstablishmentCasePersistRequest}. Toàn bộ guard/validate (case tồn tại, RBAC, role khớp
 * luồng, status_id, PMDV_CASE_HISTORY rỗng) đã chạy xong ở qldv-api TRƯỚC khi gọi xuống đây —
 * qldv-db chỉ xóa + ghi audit log, không tự thẩm định gì thêm.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CaseDeletePersistRequest {
    String caseId;
    AuditLog auditLog;
}
