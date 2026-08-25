package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;

/**
 * Bảng mở rộng lưu Bước 1 SC-08 (API-SC08-01/02) cho 5 nghiệp vụ biến động TCĐ (Giải thể/Sáp
 * nhập/Hợp nhất/Chia tách/Đổi tên) — cùng thiết kế với {@link CaseEstablishment}: 1-1 với
 * {@code PMDV_CASE} qua {@code case_id} (unique, KHÔNG phải PK của bảng này) — tra cứu theo hồ sơ
 * phải dùng {@code findByCaseId(...)}, KHÔNG dùng {@code findById}.
 * Bảng vệ tinh dùng CHUNG cho Bước 1 (SC-08) của 5 nghiệp vụ biến động tổ chức đảng
 * (Giải thể/Sáp nhập/Hợp nhất/Chia tách/Đổi tên) — quan hệ 1-1 với PMDV_CASE qua cột
 * {@code case_id} (unique, KHÔNG phải PK — PK là {@code id} UUID riêng kế thừa từ
 * {@link BaseEntity}), cùng pattern với {@link CaseBoardReview}. Field nào hiển thị/bắt buộc theo
 * đúng case_type do tầng Service quyết định (CaseChangeService, qldv-api) — entity không tự ràng
 * buộc NOT NULL ở DB cho các field điều kiện.
 *
 * Vì {@code case_id} không phải PK, tra cứu theo hồ sơ phải dùng
 * {@code CaseChangeRepository.findByCaseId(...)} (qldv-db) / {@code CaseChangeClient.findByCaseId(...)}
 * (qldv-api) — KHÔNG dùng {@code findById}.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_CASE_CHANGE")
public class CaseChange extends BaseEntity<String> {
    @Column(name = "case_id", unique = true, nullable = false)
    @Comment("FK 1-1 tới PMDV_CASE.id (unique, KHÔNG phải PK của bảng này) — gán từ Case vừa lưu")
    String caseId;

    @Column(name = "proposed_target_name", length = 250)
    @Comment("Field 3 SC-08 — tên/mô tả TCĐ mới dự kiến; NULL khi case_type=Giải thể (BR-SC08-03), "
            + "bắt buộc ở tầng Service với các case_type còn lại")
    String proposedTargetName;

    @Column(name = "survivor_organization_id")
    @Comment("FK PMDV_ORGANIZATION.id — CHỈ có giá trị khi case_type=Sáp nhập, xác định tổ chức "
            + "sống sót (giữ nguyên organization_id) trong danh sách organizationIds đã chọn")
    String survivorOrganizationId;

    @Column(name = "board_decision_no")
    @Comment("Field 4 SC-08 — số Nghị quyết/Quyết định HĐTV làm căn cứ thực hiện biến động")
    String boardDecisionNo;

    @Column(name = "board_decision_date")
    @Comment("Field 4 SC-08 — ngày ban hành văn bản HĐTV làm căn cứ")
    LocalDate boardDecisionDate;

    @Column(name = "affected_member_count")
    @Comment("Field 5 SC-08 — SNAPSHOT tổng số đảng viên của các TCĐ liên quan, tính 1 lần lúc tạo "
            + "hồ sơ, không tính lại theo thời gian thực")
    Integer affectedMemberCount;

    @Column(name = "affected_committee_member_count")
    @Comment("Field 6 SC-08 — SNAPSHOT tổng số cấp ủy viên của các TCĐ liên quan, tương tự affected_member_count")
    Integer affectedCommitteeMemberCount;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
