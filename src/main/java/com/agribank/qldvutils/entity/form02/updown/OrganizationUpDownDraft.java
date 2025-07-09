package com.agribank.qldvutils.entity.form02.updown;

import com.agribank.qldvutils.entity.BaseFormEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "qldv_org_updown_draft")
public class OrganizationUpDownDraft extends BaseFormEntity<String> {
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
    @Column(name = "history_id")
    @Comment("khoa ngoai toi bang qldv_organization_updown")
    String historyId;

    @Comment("ma can bo thuc hien")
    String createdBy;
    @Comment("ma can bo duyet")
    String approvedBy;
    @Comment("0: pending, 1: da duyet, 2: huy bo")
    Integer status;

    public static Map<String, String> FIELD_MAP = Collections.unmodifiableMap(
            new LinkedHashMap<>() {
                {
                    put("organizationCode", "Mã chi, đảng bộ");
                    put(  "oldName", "Tên chi, đảng bộ trước khi nâng cấp/hạ cấp");
                    put( "oldForm", "Hình thức chi, đảng bộ trước khi nâng cấp/hạ cấp");
                    put("newName", "Tên chi, đảng bộ sau khi nâng cấp/hạ cấp");
                    put("newForm", "Hình thức chi, đảng bộ sau khi nâng cấp/hạ cấp");
                }}
    );
}
