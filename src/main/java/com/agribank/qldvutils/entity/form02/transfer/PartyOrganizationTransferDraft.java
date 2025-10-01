package com.agribank.qldvutils.entity.form02.transfer;

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
@Entity
@Table(name = "qldv_party_organization_transfer_draft")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PartyOrganizationTransferDraft extends BaseFormEntity<String> {
    @Column(name = "receiving_org_name")
    @Comment("Tên chi, đảng bộ tiếp nhận")
    String receivingOrgName;
    @Column(name = "receiving_org_code")
    @Comment("Mã  chi, đảng bộ tiếp nhận")
    String receivingOrgCode;
    @Column(name = "ref_id")
    @Comment("id tới bản ghi chính qldv_party_organization_transfer")
    String refId;

    public static final Map<String, String> BASE_FIELD_MAP = Collections.unmodifiableMap(
            new LinkedHashMap<>() {{
                put("receivingOrgName", "Tên chi, đảng bộ tiếp nhận");
                put("receivingOrgCode", "Mã  chi, đảng bộ tiếp nhận");
            }}
    );
}
