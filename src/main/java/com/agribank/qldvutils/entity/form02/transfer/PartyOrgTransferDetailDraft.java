package com.agribank.qldvutils.entity.form02.transfer;

import com.agribank.qldvutils.entity.BaseEntity;
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

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Entity
@Table(name = "qldv_party_organization_transfer_detail_draft", schema = Constants.DV_DL)
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PartyOrgTransferDetailDraft extends BaseEntity<String> {
    @Column(name = "reference_id")
    @Comment("khoa ngoai toi bang qldv_party_organization_transfer_draft")
    String referenceId;
    @Column(name = "old_parent_code")
    @Comment("Mã chi, đảng bộ trực thuộc cũ")
    String oldParentCode;
    @Column(name = "organization_code")
    @Comment("Mã  chi, đảng bộ chuyển giao")
    String organizationCode;
    @Column(name = "organization_name")
    @Comment("Tên  chi, đảng bộ chuyển giao")
    String organizationName;
    @Column(name = "new_organization_code")
    @Comment("Mã  chi, đảng bộ chuyển giao mới")
    String newOrganizationCode;
    @Comment("Hình thức chi đảng bộ")
    String form;

    public static final Map<String, String> BASE_FIELD_MAP = Collections.unmodifiableMap(
            new LinkedHashMap<>() {{
                put("oldParentCode", "Mã chi, đảng bộ trực thuộc cũ");
                put("organizationCode", "Mã  chi, đảng bộ chuyển giao");
                put("organizationName", "Tên  chi, đảng bộ chuyển giao");
                put("newOrganizationCode", "Mã  chi, đảng bộ chuyển giao mới");
            }}
    );
}
