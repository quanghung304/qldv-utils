package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.sql.Timestamp;
import java.time.LocalDate;

/**
 * Bảng mở rộng lưu 15 field nghiệp vụ Bước 1 của SC-02 (Thành lập TCĐ) — quan hệ 1-1 với
 * PMDV_CASE qua chính case_id (KHÔNG có id UUID riêng, không dùng BaseEntity). Không có bảng
 * ERD gốc nào cho việc này (xem mục 9 prompt_S2-04_API_SC02.md) — chọn phương án bảng mở rộng
 * riêng (thay vì JSON trong PMDV_CASE) để SC-07 (Sprint 5) tái sử dụng NGUYÊN VẸN cùng cấu trúc,
 * chỉ khác ràng buộc organization_type_id/member_count áp dụng ở service layer.
 *
 * proposed_organization_name (field 7) đã có sẵn trên PMDV_CASE (Case.proposedOrganizationName)
 * — KHÔNG lặp lại ở đây. attachment_ids (field 15) tham chiếu qua PMDV_ATTACHMENT.case_id — cũng
 * không lưu lại ở đây.
 *
 * Mỗi field có {@code @Comment} — Hibernate sẽ sinh {@code COMMENT ON COLUMN ...} khi tạo/update
 * bảng, để xem trực tiếp trong công cụ quản trị CSDL mà không cần mở lại tài liệu SC-02.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_CASE_ESTABLISHMENT")
public class CaseEstablishment {
    @Id
    @Column(name = "case_id")
    @Comment("PK, đồng thời là FK 1-1 tới PMDV_CASE.id — KHÔNG tự sinh, gán từ Case vừa lưu")
    String caseId;

    @Column(name = "brcd")
    @Comment("Field 1 SC-02 (Chi nhánh/đơn vị chuyên môn) — mã chi nhánh (brcd) tra cứu qua hệ "
            + "thống IAM để lấy tên hiển thị, không lưu tên dạng text tại đây")
    Integer brcd;

    @Column(name = "staff_count")
    @Comment("Field 2 SC-02 — Số lượng lao động của chi nhánh/đơn vị, số nguyên dương")
    Integer staffCount;

    @Column(name = "leadership_staff_id")
    @Comment("Field 3 SC-02 (Thông tin ban lãnh đạo) — staff_id tra cứu hệ thống GA, null nếu "
            + "người dùng chọn nhập tay (xem leadership_info_text)")
    String leadershipStaffId;

    @Column(name = "leadership_info_text")
    @Comment("Field 3 SC-02 — nội dung nhập tay khi không tra cứu GA, null nếu dùng leadership_staff_id")
    String leadershipInfoText;

    @Column(name = "board_decision_no")
    @Comment("Field 4 SC-02 — Số văn bản Nghị quyết/Quyết định của Hội đồng thành viên (HĐTV)")
    String boardDecisionNo;

    @Column(name = "board_decision_date")
    @Comment("Field 5 SC-02 — Ngày ban hành văn bản HĐTV, phải <= ngày hiện tại (ERR-SC02-04)")
    LocalDate boardDecisionDate;

    @Column(name = "board_decision_summary")
    @Comment("Field 6 SC-02 — Trích yếu nội dung văn bản HĐTV")
    String boardDecisionSummary;

    @Column(name = "organization_type_id")
    @Comment("Field 8 SC-02 — FK PMDV_ORGANIZATION_TYPE.id; ở SC-07 (Sprint 5) bị server cố định, "
            + "client không được override (BR-SC07-01)")
    String organizationTypeId;

    @Column(name = "member_count")
    @Comment("Field 9 SC-02 — Số lượng đảng viên dự kiến; ngưỡng tối thiểu tra theo "
            + "organization_type_id (BR-SC02-01, PMDV_ORGANIZATION_TYPE.min_member_count)")
    Integer memberCount;

    @Column(name = "committee_member_count")
    @Comment("Field 10 SC-02 — Số lượng cấp ủy viên dự kiến, phải <= member_count (ERR-SC02-08)")
    Integer committeeMemberCount;

    @Column(name = "committee_structure")
    @Comment("Field 11 SC-02 — Mô tả cơ cấu cấp ủy dự kiến (VD: 1 Bí thư, 1 Phó Bí thư, 3 Ủy viên)")
    String committeeStructure;

    @Column(name = "political_standard_conclusion_no")
    @Comment("Field 13 SC-02 — Số kết luận/thông báo tiêu chuẩn chính trị (TCCT)")
    String politicalStandardConclusionNo;

    @Column(name = "political_standard_conclusion_date")
    @Comment("Field 14 SC-02 — Ngày ban hành kết luận TCCT; quá 6 tháng thì cảnh báo BR-SC02-02 "
            + "(ERR-SC02-13), không chặn lưu")
    LocalDate politicalStandardConclusionDate;

    @Column(name = "created_at")
    @Comment("Thời điểm tạo bản ghi — set 1 lần lúc insert, không đổi khi update")
    Timestamp createdAt;

    @Column(name = "updated_at")
    @Comment("Thời điểm cập nhật gần nhất — set lại mỗi lần insert/update")
    Timestamp updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = new Timestamp(System.currentTimeMillis());
        updatedAt = new Timestamp(System.currentTimeMillis());
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = new Timestamp(System.currentTimeMillis());
    }
}
