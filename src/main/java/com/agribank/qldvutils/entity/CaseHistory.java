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
    @Column(name = "case_id")
    String caseId;

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

    @Column(name = "comment")
    String comment;

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
