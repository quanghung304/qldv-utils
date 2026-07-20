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

import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_CASE_HISTORY")
public class CaseHistory extends BaseEntity<String> {
    /** Tên bảng hồ sơ nguồn, VD 'PMDV_CASE' — polymorphic để 1 bảng lịch sử dùng chung được cho
     * cả module Tổ chức Đảng (PMDV_CASE) lẫn module Đảng viên sau này (VD PMDV_MEMBER_CASE). */
    @Column(name = "entity_table")
    String entityTable;

    /** Khóa chính (id) của bản ghi hồ sơ trong bảng entity_table. */
    @Column(name = "entity_id")
    String entityId;

    @Column(name = "from_status_id")
    String fromStatusId;

    @Column(name = "action")
    String action;

    @Column(name = "to_status_id")
    String toStatusId;

    @Column(name = "performed_by")
    String performedBy;

    @Column(name = "performed_role_id")
    String performedRoleId;

    @Column(name = "note")
    String note;

    @Column(name = "processed_at")
    Timestamp processedAt;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
