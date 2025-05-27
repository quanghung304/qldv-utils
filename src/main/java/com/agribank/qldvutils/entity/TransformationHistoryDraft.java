package com.agribank.qldvutils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "qldv_transformation_history_draft")
public class TransformationHistoryDraft extends BaseFormEntity<String> {
    @Column(name = "organization_code")
    String organizationCode;
    @Comment("1: nang cap, 2: ha cap")
    Integer type;
    @Column(name = "old_name")
    String oldName;
    @Column(name = "old_form")
    String oldForm;
    @Column(name = "new_name")
    String newName;
    @Column(name = "new_form")
    String newForm;

    @Comment("ma can bo thuc hien")
    String createdBy;
    @Comment("ma can bo duyet")
    String approvedBy;
    @Comment("0: pending, 1: da duyet, 2: huy bo")
    Integer status;

    public static Map<String, String> FIELD_MAP = Map.of(
            "organizationCode", "Mã chi, đảng bộ",
            "oldName", "Tên chi, đảng bộ trước khi nâng cấp/hạ cấp",
            "oldForm", "Hình thức chi, đảng bộ trước khi nâng cấp/hạ cấp",
            "newName", "Tên chi, đảng bộ sau khi nâng cấp/hạ cấp",
            "newForm", "Hình thức chi, đảng bộ sau khi nâng cấp/hạ cấp"
    );
}
