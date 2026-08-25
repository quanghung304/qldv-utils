package com.agribank.qldvutils.request.casemgmt;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

/**
 * API-SC06-02 (POST /cases/{id}/complete) — gói toàn bộ side-effect của "Phê duyệt hoàn thành"
 * cho CẢ 6 loại nghiệp vụ (Thành lập/Giải thể/Sáp nhập/Hợp nhất/Chia tách/Đổi tên,
 * API_HoanThanh_6LoaiNghiepVu.md) thành 1 lệnh gửi xuống qldv-db, chạy trong ĐÚNG 1 transaction
 * ({@code CaseCompleteService}, qldv-db) — cùng pattern atomic multi-entity persist đã dùng cho
 * {@code EstablishmentCasePersistRequest}. Toàn bộ guard/validate (case tồn tại, role khớp rule
 * workflow, tên tổ chức không trùng, tổng member_count, phân bổ cấp ủy Chia tách...) đã chạy xong
 * ở qldv-api TRƯỚC khi gọi xuống đây — qldv-db chỉ thực thi + tự gán id, KHÔNG tự thẩm định gì
 * thêm, TRỪ phần duyệt cây tổ chức con để cascade giải thể (buộc phải chạy ở qldv-db vì cần lặp
 * truy vấn DB nhiều cấp trong CÙNG 1 transaction — xem {@code CaseCompleteService}).
 *
 * Chỉ 1 trong 3 nhóm field dưới đây có giá trị tùy theo case_type (2 nhóm còn lại null/rỗng):
 * - {@code newOrganizations}: Thành lập (1 phần tử) · Sáp nhập/Hợp nhất (1 phần tử) · Chia tách
 *   (≥2 phần tử) — null/rỗng với Giải thể/Đổi tên.
 * - {@code sourceOrganizationIdsToDissolve}: Giải thể/Sáp nhập/Hợp nhất/Chia tách (root id — qldv-db
 *   tự duyệt xuống hết tổ chức con ĐANG Hoạt động của từng root) — null/rỗng với Thành lập/Đổi tên.
 * - {@code renameOrganizationId}/{@code renameNewName}: CHỈ Đổi tên.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CaseCompletePersistRequest {
    String caseId;

    List<NewOrganizationEntry> newOrganizations;

    List<String> sourceOrganizationIdsToDissolve;
    String dissolveDecisionNo;
    LocalDate dissolveDecisionDate;

    String renameOrganizationId;
    String renameNewName;

    String fromStatusId;
    String toStatusId;
    String action;
    String performedBy;
    String performedRoleId;
    /** Giá trị MỚI cho Case.assignedUserId sau khi hoàn thành — luôn null vì trạng thái đích (A-15/B-05) là FINAL, không còn ai cần gán tiếp (tính qua WorkflowRoleResolver, không hardcode). */
    String assignedUserId;
}
