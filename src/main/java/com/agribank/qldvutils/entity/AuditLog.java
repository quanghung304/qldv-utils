package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

/** BR-GL-05 — nhật ký toàn hệ thống, polymorphic qua (entity_name, entity_id), xem data-model.md. */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "PMDV_AUDIT_LOG")
public class AuditLog extends BaseEntity<String> {
    @Column(name = "entity_name")
    String entityName;

    @Column(name = "entity_id")
    String entityId;

    @Column(name = "action")
    String action;

    /** Độ dài không cố định (VD snapshot JSON) — cần CLOB, KHÔNG dùng VARCHAR2(255) mặc định. */
    @Lob
    @Column(name = "change_detail")
    String changeDetail;

    @Column(name = "performed_by")
    String performedBy;

    @Column(name = "performed_at")
    Timestamp performedAt;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
