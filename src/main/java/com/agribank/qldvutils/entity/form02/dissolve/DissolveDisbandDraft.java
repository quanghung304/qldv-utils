package com.agribank.qldvutils.entity.form02.dissolve;

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

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "qldv_dissolve_disband_draft")
public class DissolveDisbandDraft extends BaseFormEntity<String> {
    @Column(name = "organization_code")
    String organizationCode;
    String name;
    String form;
    @Comment("6: giai the, 7: giai tan")
    Integer type;

    @Comment("0: pending, 1: da duyet, 2: huy bo")
    Integer status;
    @Column(name = "created_by")
    String createdBy;
    @Column(name = "approved_by")
    String approvedBy;
    @Column(name = "ref_id")
    String refId;

    public static Map<String, String> FIELD_MAP = Collections.unmodifiableMap(
            new LinkedHashMap<>() {
                {
                    put("organizationCode", "Mã chi, đảng bộ");
                    put("name", "Tên chi, đảng bộ");
                    put("form", "Hình thức chi, đảng bộ");
                }}
    );
}
