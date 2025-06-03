package com.agribank.qldvutils.entity.development_plan;

import com.agribank.qldvutils.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "QLDV_DEVELOPMENT_PLAN_DRAFT")
public class DevelopmentPlanDraft extends BaseEntity<String> {
    @Column(name = "ORGANIZATION_CODE")
    String organizationCode;

    @Column(name = "NAME")
    String name;

    @Column(name = "START_YEAR")
    Integer start;

    @Column(name = "END_YEAR")
    Integer end;

    @Column(name = "TARGET")
    Integer target;

    @Column(name = "PRNT_CODE")
    String prntCode;

    @Column(name = "HAS_CHILD")
    Integer hasChild;
    @Column(name = "ref_id")
    String refId;

    Integer status;
    @Column(name = "CREATED_BY")
    String createdBy;
    @Column(name = "APPROVED_BY")
    String approvedBy;

    public static Map<String, String> BASE_FIELD_MAP = Map.of(
            "organizationCode", "Mã chi, Đảng bộ",
            "name", "Tên chi Đảng bộ",
            "start", "Từ năm",
            "end", "Đến năm",
            "target", "Mục tiêu"
    );
}
