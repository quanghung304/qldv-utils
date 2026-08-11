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

/**
 * 1 tổ chức đảng ĐÍCH của hồ sơ biến động (SC-08) — Sáp nhập/Hợp nhất luôn có ĐÚNG 1 dòng, Chia
 * tách có ≥2 dòng cho CÙNG 1 case_id; Giải thể/Đổi tên KHÔNG có dòng nào. Nhập ngay ở Bước 1
 * (API-SC08-01/02) — dùng lại nguyên vẹn khi Hoàn thành (API-SC06-02), KHÔNG bắt nhập lại.
 * KHÔNG unique trên case_id (khác {@link CaseEstablishment}/{@link CaseChange}) vì 1 case có thể
 * có nhiều dòng (Chia tách).
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_CASE_CHANGE_TARGET")
public class CaseChangeTarget extends BaseEntity<String> {
    @Column(name = "case_id")
    @Comment("FK PMDV_CASE.id — KHÔNG unique, 1 case có thể có nhiều dòng (Chia tách)")
    String caseId;

    @Column(name = "organization_name")
    String organizationName;

    @Column(name = "organization_type_id")
    @Comment("FK PMDV_ORGANIZATION_TYPE.id — nhập ở đây vì SC-08 (Bước 1) không có field chọn loại hình cho TCĐ đích")
    String organizationTypeId;

    @Column(name = "member_count")
    @Comment("Sáp nhập/Hợp nhất: KHÔNG dùng field này (server tự tính = SUM nguồn). Chia tách: BẮT BUỘC, SUM toàn bộ dòng phải khớp member_count TCĐ nguồn")
    Integer memberCount;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
