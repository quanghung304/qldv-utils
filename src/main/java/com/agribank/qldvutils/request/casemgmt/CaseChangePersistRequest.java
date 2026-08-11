package com.agribank.qldvutils.request.casemgmt;

import com.agribank.qldvutils.entity.Case;
import com.agribank.qldvutils.entity.CaseChange;
import com.agribank.qldvutils.entity.CaseOrganization;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * Gói toàn bộ thao tác ghi của API-SC08-01/02 thành 1 lệnh gửi xuống qldv-db, chạy trong ĐÚNG 1
 * transaction ({@code CaseChangePersistService}) — cùng pattern atomic multi-entity persist đã
 * dùng cho {@code EstablishmentCasePersistRequest}.
 * Gói toàn bộ thao tác ghi của API-SC08-01/02 (POST /cases/changes, PUT /cases/{id}/change)
 * thành 1 lệnh gửi xuống qldv-db, chạy trong ĐÚNG 1 transaction — cùng lý do/pattern với
 * {@link EstablishmentCasePersistRequest}: nhiều bảng liên quan (PMDV_CASE + PMDV_CASE_CHANGE +
 * PMDV_CASE_ORGANIZATION) không được ghi qua nhiều lệnh Feign rời rạc. qldv-db CHỈ thực thi
 * persist + tự gán lại case_id sau khi biết id của Case vừa lưu — không tự thẩm định gì thêm.
 *
 * {@code organizations}/{@code targets} null = không đụng danh sách hiện có; non-null (kể cả rỗng)
 * + {@code replaceOrganizations}/{@code replaceTargets}=true = xóa hết rồi ghi lại đúng danh sách
 * này (tách cờ replace riêng khỏi null-check của list để tường minh ý định, tránh nhầm "gửi danh
 * sách rỗng" với "không gửi field này").
 *
 * {@code targets}: TCĐ đích của Sáp nhập/Hợp nhất (đúng 1 phần tử)/Chia tách (≥2 phần tử) — nhập
 * NGAY Ở BƯỚC 1 (SC-08), dùng lại nguyên vẹn ở API-SC06-02 (Hoàn thành), không bắt nhập lại.
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
    List<CaseChangeTargetEntry> targets;
    Boolean replaceTargets;
}
