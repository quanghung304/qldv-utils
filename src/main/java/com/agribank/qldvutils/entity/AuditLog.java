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
@Table(name = "PMDV_AUDIT_LOG")
public class AuditLog extends BaseEntity<String> {
    @Column(name = "entity_name")
    String entityName;

    @Column(name = "entity_id")
    String entityId;

    @Column(name = "action")
    String action;

    @Column(name = "change_detail")
    String changeDetail;

    @Column(name = "performed_by")
    String performedBy;

    @Column(name = "performed_at")
    Timestamp performedAt;

    @Column(name = "ip_address")
    String ipAddress;

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
    }
}
