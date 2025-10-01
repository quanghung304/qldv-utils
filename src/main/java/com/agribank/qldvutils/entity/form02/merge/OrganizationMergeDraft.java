package com.agribank.qldvutils.entity.form02.merge;

import com.agribank.qldvutils.entity.base.BaseFormDraftEntity;
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
@Entity
@Table(name = "qldv_org_merge_draft")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationMergeDraft extends BaseFormDraftEntity {
    @Column(name = "organization_code")
    @Comment("ma chi dang bo nhan sap nhap/sau hop nhat")
    String organizationCode;
    @Column(name = "organization_name")
    @Comment("ten chi dang bo nhan sap nhap/sau hop nhat")
    String organizationName;
    @Comment("hinh thuc chi dang bo sau hop nhat")
    String form;
    @Comment("4: sap nhap, 5: hop nhat")
    Integer type;
    @Column(name = "ref_id")
    String refId;

    public static Map<String, String> FIELD_MAP_MERGE = Collections.unmodifiableMap(
            new LinkedHashMap<>() {{
                put("organizationCode", "Mã chi, đảng bộ nhận sáp nhập");
                put("organizationName", "Tên chi, đảng bộ nhận sáp nhập ");
            }}
    );

    public static Map<String, String> FIELD_MAP_UNIFY = Collections.unmodifiableMap(
            new LinkedHashMap<>() {{
                put("organizationCode", "Mã chi, đảng bộ mới");
                put("organizationName", "Tên chi, đảng bộ mới ");
            }}
    );
}
