package com.agribank.qldvutils.entity.form02.rename;

import com.agribank.qldvutils.entity.base.BaseFormDraftEntity;
import com.agribank.qldvutils.enums.Constants;
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
@Table(name = "qldv_organization_rename_draft", schema = Constants.DV_DL)
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationRenameDraft extends BaseFormDraftEntity {
    @Column(name = "organization_code")
    String organizationCode;

    @Column(name = "organization_name")
    String organizationName;

    @Column(name = "old_organization_name")
    String oldOrganizationName;

    @Column(name = "ref_id")
    @Comment("Khoa ngoai toi bang qldv_organization_rename")
    String refId;

    public static Map<String, String> FIELD_MAP = Collections.unmodifiableMap(
            new LinkedHashMap<>() {
                {
                    put("organizationCode", "Mã chi, đảng bộ");
                    put("organizationName", "Tên chi, đảng bộ sau khi đổi tên");
                    put("oldOrganizationName", "Tên chi, đảng bộ trước khi đổi tên");
                }
            }
    );
}
