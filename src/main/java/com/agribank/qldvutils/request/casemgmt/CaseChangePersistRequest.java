package com.agribank.qldvutils.request.casemgmt;

import com.agribank.qldvutils.entity.Case;
import com.agribank.qldvutils.entity.CaseChange;
import com.agribank.qldvutils.entity.CaseOrganization;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * Gói toàn bộ thao tác ghi của API-SC08-01/02 (POST /cases/changes, PUT /cases/{id}/change)
 * thành 1 lệnh gửi xuống qldv-db, chạy trong ĐÚNG 1 transaction — cùng lý do/pattern với
 * {@link EstablishmentCasePersistRequest}: nhiều bảng liên quan (PMDV_CASE + PMDV_CASE_CHANGE +
 * PMDV_CASE_ORGANIZATION) không được ghi qua nhiều lệnh Feign rời rạc. qldv-db CHỈ thực thi
 * persist + tự gán lại case_id sau khi biết id của Case vừa lưu — không tự thẩm định gì thêm.
 *
 * {@code replaceOrganizations = true} nghĩa là xóa toàn bộ PMDV_CASE_ORGANIZATION (link_role=SOURCE)
 * hiện có của case này rồi ghi lại đúng {@code organizations} — dùng cho PUT khi organizationIds
 * thay đổi; tạo mới (POST) luôn để {@code true} vì case chưa từng có dòng nào.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CaseChangePersistRequest {
    Case caseEntity;
    CaseChange caseChange;
    List<CaseOrganization> organizations;
    boolean replaceOrganizations;
}
