package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

/**
 * Danh sách cấp ủy DỰ KIẾN (field 12, SC-02 Bước 1) — trước khi có Quyết định thành lập nên tổ
 * chức đảng (PMDV_ORGANIZATION) CHƯA tồn tại, không thể ghi thẳng vào PMDV_COMMITTEE_MEMBER
 * (PK bắt buộc organization_id). Bảng riêng gắn theo case_id, sẽ được "chính thức hóa" thành
 * PMDV_COMMITTEE_MEMBER (status=OFFICIAL) ở Bước 3/SC-05 khi tổ chức đảng chính thức được tạo —
 * xem ghi chú GC-02 (Data Model ERD), decision cho S2-04 vì SC-05 nằm ngoài phạm vi task này.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_CASE_ESTB_COMMITTEE")
@IdClass(CaseEstablishmentCommitteeId.class)
public class CaseEstablishmentCommittee {
    @Id
    @Column(name = "case_id")
    @Comment("PK (cùng staff_code) — FK PMDV_CASE.id, hồ sơ Thành lập TCĐ chứa dòng cấp ủy dự kiến này")
    String caseId;

    @Id
    @Column(name = "staff_code")
    @Comment("PK (cùng case_id) — FK PMDV_STAFF.staff_code, cán bộ được đề xuất vào cấp ủy")
    String staffCode;

    @Column(name = "proposed_position")
    @Comment("Chức danh dự kiến — enum ECommitteePosition (1=SECRETARY, 2=DEPUTY_SECRETARY, "
            + "3=MEMBER), đồng bộ PMDV_COMMITTEE_MEMBER.position; tối đa 1 dòng SECRETARY/case_id")
    Integer proposedPosition;
}
