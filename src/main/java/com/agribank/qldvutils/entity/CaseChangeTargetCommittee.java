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
 * Danh sách cấp ủy dự kiến của 1 {@link CaseChangeTarget} — cùng vai trò với
 * {@link CaseEstablishmentCommittee} (Thành lập) nhưng khóa theo case_change_target_id thay vì
 * case_id, vì Chia tách có nhiều TCĐ đích trong CÙNG 1 case, mỗi đích 1 danh sách cấp ủy riêng.
 * "Chính thức hóa" thành PMDV_COMMITTEE_MEMBER (status=OFFICIAL) ở API-SC06-02.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_CASE_CHANGE_TARGET_COMMITTEE")
@IdClass(CaseChangeTargetCommitteeId.class)
public class CaseChangeTargetCommittee {
    @Id
    @Column(name = "case_change_target_id")
    @Comment("PK (cùng staff_code) — FK CaseChangeTarget.id")
    String caseChangeTargetId;

    @Id
    @Column(name = "staff_code")
    @Comment("PK (cùng case_change_target_id) — FK PMDV_STAFF.staff_code")
    String staffCode;

    @Column(name = "proposed_position")
    @Comment("Chức danh dự kiến — enum ECommitteePosition, đồng bộ PMDV_COMMITTEE_MEMBER.position")
    Integer proposedPosition;
}
