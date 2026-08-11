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
    @Column(name = "case_id", unique = true)
    @Comment("FK PMDV_CASE.id — unique (quan hệ 1-1), KHÔNG phải PK của bảng này")
    String caseId;

    @Column(name = "proposed_target_name")
    @Comment("Field 3 SC-08 — tên TCĐ đích dự kiến; NULL với nghiệp vụ Giải thể (không có TCĐ đích)")
    String proposedTargetName;

    @Column(name = "survivor_organization_id")
    @Comment("Chỉ áp dụng nghiệp vụ Sáp nhập (case_type=MERGE) — TCĐ nguồn nào được đề xuất làm TCĐ đích")
    String survivorOrganizationId;

    @Column(name = "board_decision_no")
    String boardDecisionNo;

    @Column(name = "board_decision_date")
    LocalDate boardDecisionDate;

    @Column(name = "affected_member_count")
    @Comment("SUM member_count của toàn bộ TCĐ nguồn đã chọn ở field 2 SC-08")
    Integer affectedMemberCount;

    @Column(name = "affected_committee_member_count")
    @Comment("SUM committee_member_count của toàn bộ TCĐ nguồn đã chọn ở field 2 SC-08")
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
