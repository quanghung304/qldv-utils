package com.agribank.qldvutils.request.casemgmt;

import com.agribank.qldvutils.entity.CommitteeMember;
import com.agribank.qldvutils.entity.Organization;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * API-SC06-02 (POST /cases/{id}/complete) — gói toàn bộ side-effect của "Phê duyệt hoàn thành"
 * (PMDV_ORGANIZATION mới + PMDV_CASE_ORGANIZATION link TARGET + PMDV_COMMITTEE_MEMBER chính thức
 * hóa + PMDV_CASE.status_id/completed_at + PMDV_CASE_HISTORY) thành 1 lệnh gửi xuống qldv-db,
 * chạy trong ĐÚNG 1 transaction (CaseCompleteService), cùng pattern atomic multi-entity persist đã
 * dùng cho {@code EstablishmentCasePersistRequest}/{@code CaseDeletePersistRequest}. Toàn bộ
 * guard/validate (case tồn tại, role khớp rule workflow, tên tổ chức không trùng...) đã chạy xong
 * ở qldv-api TRƯỚC khi gọi xuống đây — qldv-db chỉ persist + tự gán organization_id cho
 * committeeMembers sau khi biết id của Organization vừa lưu, không tự thẩm định gì thêm.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CaseCompletePersistRequest {
    String caseId;
    Organization organization;
    List<CommitteeMember> committeeMembers;
    String fromStatusId;
    String toStatusId;
    String action;
    String performedBy;
    String performedRoleId;
}
